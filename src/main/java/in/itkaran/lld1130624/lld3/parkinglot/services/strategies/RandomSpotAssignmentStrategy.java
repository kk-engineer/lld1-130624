package in.itkaran.lld1130624.lld3.parkinglot.services.strategies;

import in.itkaran.lld1130624.lld3.parkinglot.models.Gate;
import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingSpot;
import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingSpotStatus;
import in.itkaran.lld1130624.lld3.parkinglot.models.VehicleType;
import in.itkaran.lld1130624.lld3.parkinglot.repositories.ParkingSpotRepository;

import java.util.Optional;
import java.util.Random;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate,
                                  ParkingSpotRepository parkingRepository) {
        Optional<ParkingSpot> parkingSpotOptional = Optional.empty();
        do {
            Random random = new Random();
            int spotNumber = random.nextInt(10) + 1;
            char spotChar = (char) (random.nextInt(26) + 'A');
            String spotStr = spotChar + String.valueOf(spotNumber);
            int floorNumber = random.nextInt(10) + 1;
            parkingSpotOptional = parkingRepository.findParkingSpotBySpotNumberAndFloorId(spotStr, (long) floorNumber);
        } while (parkingSpotOptional.isEmpty() || parkingSpotOptional.get().getStatus()== ParkingSpotStatus.OCCUPIED);
        ParkingSpot parkingSpot = parkingSpotOptional.get();
        parkingSpot.setStatus(ParkingSpotStatus.OCCUPIED);
        return parkingSpot;
    }
}
