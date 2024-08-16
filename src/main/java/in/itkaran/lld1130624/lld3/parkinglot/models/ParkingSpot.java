package in.itkaran.lld1130624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel {
    private ParkingSpotStatus status;
    private List<VehicleType> supportedVehicleTypes;
    private String spotNumber;
    private Long parkingFloorId;

    public String toString() {
        return "Spot Number: " + spotNumber +  "\n" +
                "Parking Floor Number: " + parkingFloorId + "\n" +
                "Status: " + status;
    }
}
