package in.itkaran.lld1130624.lld3.parkinglot.services;

import in.itkaran.lld1130624.lld3.parkinglot.exceptions.GateNotFoundException;
import in.itkaran.lld1130624.lld3.parkinglot.models.*;
import in.itkaran.lld1130624.lld3.parkinglot.repositories.*;
import in.itkaran.lld1130624.lld3.parkinglot.services.factory.SpotAssignmentStrategyFactory;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository,
                         GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              VehicleType vehicleType,
                              String ownerName) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // find gate by id
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Gate not found with id: " + gateId);
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        // Get the vehicle object with number
        // If vehicle not found, create a new vehicle object
        // and save it in the vehicle repository
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle = null;
        if (optionalVehicle.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setType(vehicleType);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);

        // assign the spot to the vehicle
        Long parkingLotId = gate.getParkingLot().getId();
        ParkingLot parkingLot = parkingLotRepository.findParkingLotById(parkingLotId);
        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
                                                            getSpotAssignmentStrategy(spotAssignmentStrategyType);
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate, parkingSpotRepository);
        ticket.setParkingSpot(parkingSpot);
        // Set a random alphanumeric string for the ticket
        ticket.setNumber(RandomStringGenerationService.generateRandomAlphanumericString());
        return ticketRepository.save(ticket);
    }
}
