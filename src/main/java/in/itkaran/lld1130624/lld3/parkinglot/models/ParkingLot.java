package in.itkaran.lld1130624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel {
    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleTypes;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private FeeCalculationStrategyType feeCalculationStrategyType;
}
