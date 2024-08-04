package in.itkaran.lld1130624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel {
    private ParkingSpotStatus status;
    private List<VehicleType> supportedVehicleTypes;
    private int spotNumber;
    private Long parkingFloorId;

    public String toString() {
        return "" + spotNumber;
    }
}
