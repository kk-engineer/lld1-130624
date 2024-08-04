package in.itkaran.lld1130624.lld3.parkinglot.services.strategies;

import in.itkaran.lld1130624.lld3.parkinglot.models.Gate;
import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingSpot;
import in.itkaran.lld1130624.lld3.parkinglot.models.VehicleType;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate) {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setSpotNumber(1);
        parkingSpot.setParkingFloorId(1L);
        return parkingSpot;
    }
}
