package in.itkaran.lld1130624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel {
    private GateType gateType;
    private GateStatus gateStatus;
    private Operator operator;
    private ParkingLot parkingLot;

    public String toString() {
        return "" + this.getId();
    }
}
