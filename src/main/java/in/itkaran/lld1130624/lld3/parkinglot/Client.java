package in.itkaran.lld1130624.lld3.parkinglot;

import in.itkaran.lld1130624.lld3.parkinglot.controllers.TicketController;
import in.itkaran.lld1130624.lld3.parkinglot.dtos.IssueTicketRequestDto;
import in.itkaran.lld1130624.lld3.parkinglot.dtos.IssueTicketResponseDto;
import in.itkaran.lld1130624.lld3.parkinglot.models.*;
import in.itkaran.lld1130624.lld3.parkinglot.repositories.*;
import in.itkaran.lld1130624.lld3.parkinglot.services.RandomStringGenerationService;
import in.itkaran.lld1130624.lld3.parkinglot.services.TicketService;

import java.util.List;

public class Client {
    private static final TicketRepository ticketRepository = new TicketRepository();
    private static final GateRepository gateRepository = new GateRepository();
    private static final VehicleRepository vehicleRepository = new VehicleRepository();
    private static final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    private static final ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    private static final ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    private static final TicketService ticketService = new TicketService(
            ticketRepository,
            gateRepository,
            vehicleRepository,
            parkingLotRepository
    );

    public static void main(String[] args) {

        //demoRandomString();
        createTestData();
        demoIssueTicket();
    }

    private static void demoIssueTicket() {
        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleNumber("KA-01-HH-1234");
        requestDto.setVehicleType(VehicleType.FOUR_WHEELER);
        requestDto.setOwnerName("Karan");

        TicketController ticketController = new TicketController(ticketService);
        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
        Ticket ticket = responseDto.getTicket();
        System.out.println("Ticket details: " + ticket.toString());
    }

    private static void demoRandomString() {
        System.out.println("Random String: " + RandomStringGenerationService.generateRandomAlphanumericString());
    }

    private static void createTestData() {
        // Create parking spots
        List<VehicleType> supportedVehicleTypes = List.of(VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER);
        ParkingSpot parkingSpot1 = new ParkingSpot();
        parkingSpot1.setSupportedVehicleTypes(supportedVehicleTypes);
        parkingSpot1.setStatus(ParkingSpotStatus.VACANT);
        parkingSpot1.setParkingFloorId(1L);
        parkingSpot1.setSpotNumber(1);

        // save parking spot
        parkingSpotRepository.save(parkingSpot1);

        // Create parking floor
        ParkingFloor parkingFloor1 = new ParkingFloor();
        parkingFloor1.setFloorNumber(1);
        parkingFloor1.setParkingSpots(List.of(parkingSpot1));
        parkingFloor1.setParkingFloorStatus(ParkingFloorStatus.OPERATIONAL);

        // save parking floor
        parkingFloorRepository.save(parkingFloor1);

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Phoenix Mall");
        parkingLot.setParkingFloors(List.of(parkingFloor1));
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSupportedVehicleTypes(supportedVehicleTypes);
        parkingLot.setSpotAssignmentStrategyType(SpotAssignmentStrategyType.NEAREST);
        parkingLot.setFeeCalculationStrategyType(FeeCalculationStrategyType.WEEKDAY);

        // save parking lot
        parkingLotRepository.save(parkingLot);

        // create operator
        Operator operator = new Operator();
        operator.setName("Rahul");
        operator.setEmpId(555);

        // Create gate
        Gate gate = new Gate();
        gate.setParkingLot(parkingLot);
        gate.setGateType(GateType.ENTRY);
        gate.setOperator(operator);
        gate.setGateStatus(GateStatus.OPEN);
        gate.setId(123L);

        // save gate
        gateRepository.save(gate);
    }
}
