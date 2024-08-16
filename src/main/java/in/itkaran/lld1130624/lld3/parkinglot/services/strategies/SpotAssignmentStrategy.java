package in.itkaran.lld1130624.lld3.parkinglot.services.strategies;

import in.itkaran.lld1130624.lld3.parkinglot.models.Gate;
import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingSpot;
import in.itkaran.lld1130624.lld3.parkinglot.models.VehicleType;
import in.itkaran.lld1130624.lld3.parkinglot.repositories.ParkingSpotRepository;

public interface SpotAssignmentStrategy {
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate, ParkingSpotRepository parkingRepository);
}
