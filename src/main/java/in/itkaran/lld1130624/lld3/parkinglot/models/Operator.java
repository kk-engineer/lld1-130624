package in.itkaran.lld1130624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel {
    private String name;
    private int empId;

    public String toString() {
        return name;
    }
}
