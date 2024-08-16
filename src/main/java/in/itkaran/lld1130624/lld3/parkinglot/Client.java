package in.itkaran.lld1130624.lld3.parkinglot;

import in.itkaran.lld1130624.lld3.parkinglot.controllers.TicketController;
import in.itkaran.lld1130624.lld3.parkinglot.dtos.IssueTicketRequestDto;
import in.itkaran.lld1130624.lld3.parkinglot.dtos.IssueTicketResponseDto;
import in.itkaran.lld1130624.lld3.parkinglot.models.*;
import in.itkaran.lld1130624.lld3.parkinglot.repositories.*;
import in.itkaran.lld1130624.lld3.parkinglot.services.TicketService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static final TicketRepository ticketRepository = new TicketRepository();
    private static final GateRepository gateRepository = new GateRepository();
    private static final VehicleRepository vehicleRepository = new VehicleRepository();
    private static final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    private static final ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    private static final ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    private static final String SPOT_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int SPOT_COUNT_PER_CHARACTER = 10;
    private static final int FLOOR_COUNT = 10;

    private static final Scanner scanner = new Scanner(System.in);


    private static final TicketService ticketService = new TicketService(
            ticketRepository,
            gateRepository,
            vehicleRepository,
            parkingLotRepository,
            parkingSpotRepository
    );

    public static void main(String[] args) {

        //demoRandomString();
        createTestData();
        demoUserInput();
//        demoIssueTicket();
//        showAllParkingSpots();
//        showAllOccupiedParkingSpots();
//        showAllAvailableParkingSpots();
    }

    private static void demoUserInput() {
        while (true) {
            System.out.println("Enter: \n" +
                    "1 to Issue Ticket \n" +
                    "2 to Show Occupied Spots \n" +
                    "3 to Show Available Spots \n" +
                    "9 to Exit");

            String input = scanner.nextLine();
            if (input.equals("9")) {
                break;
            }

            switch (input) {
                case "1":
                    demoIssueTicket();
                    break;
                case "2":
                    showAllOccupiedParkingSpots();
                    break;
                case "3":
                    showAllAvailableParkingSpots();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }


    private static void showAllAvailableParkingSpots() {
        System.out.println("Showing all available parking spots: ");
        List<ParkingSpot> parkingSpots = parkingSpotRepository.findAllByParkingSpotStatus(
                                                ParkingSpotStatus.VACANT);
        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println("#######################");
            System.out.println("Parking spot: " + parkingSpot.toString());
            System.out.println("#######################");
        }
    }

    private static void showAllOccupiedParkingSpots() {
        System.out.println("Showing all occupied parking spots: ");
        List<ParkingSpot> parkingSpots = parkingSpotRepository.findAllByParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println("#######################");
            System.out.println("Parking spot: " + parkingSpot.toString());
            System.out.println("#######################");
        }
    }

    private static void showAllParkingSpots() {
        System.out.println("Showing all parking spots: ");
        List<ParkingSpot> parkingSpots = parkingSpotRepository.findAll();
        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println("Parking spot: " + parkingSpot.toString());
        }
    }

    private static void demoIssueTicket() {

            IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
            requestDto.setGateId(123L);
            requestDto.setVehicleType(VehicleType.FOUR_WHEELER);
            System.out.println("Enter vehicle number: ");
            requestDto.setVehicleNumber(scanner.nextLine());
            System.out.println("Enter owner name: ");
            requestDto.setOwnerName(scanner.nextLine());

            TicketController ticketController = new TicketController(ticketService);
            IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
            Ticket ticket = responseDto.getTicket();
            System.out.println("Ticket details: " + ticket.toString());
    }

    private static void createTestData() {
        List<VehicleType> supportedVehicleTypes = List.of(VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER);
        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for (int i=1; i<=FLOOR_COUNT; i++) {
            // create parking floor
            ParkingFloor parkingFloor = new ParkingFloor();
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for (int j=0; j<SPOT_CHARACTERS.length(); j++) {
                for (int k=1; k<=SPOT_COUNT_PER_CHARACTER; k++) {
                    // create parking spot
                    ParkingSpot parkingSpot = new ParkingSpot();
                    parkingSpot.setSupportedVehicleTypes(supportedVehicleTypes);
                    parkingSpot.setStatus(ParkingSpotStatus.VACANT);
                    parkingSpot.setParkingFloorId((long)i);
                    parkingSpot.setSpotNumber(SPOT_CHARACTERS.charAt(j) + String.valueOf(k));
                    parkingSpots.add(parkingSpot);
                    parkingSpotRepository.save(parkingSpot);
                }
            }
            parkingFloor.setParkingSpots(parkingSpots);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPERATIONAL);
            parkingFloors.add(parkingFloor);
            parkingFloorRepository.save(parkingFloor);
        }

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Phoenix Mall");
        parkingLot.setParkingFloors(parkingFloors);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSupportedVehicleTypes(supportedVehicleTypes);
        parkingLot.setSpotAssignmentStrategyType(SpotAssignmentStrategyType.RANDOM);
        parkingLot.setFeeCalculationStrategyType(FeeCalculationStrategyType.WEEKDAY);

        // save parking lot
        parkingLotRepository.save(parkingLot);

        // create operator
        Operator operator = new Operator();
        operator.setName("Robot 123");
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
