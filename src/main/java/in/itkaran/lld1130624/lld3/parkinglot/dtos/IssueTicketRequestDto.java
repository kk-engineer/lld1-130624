package in.itkaran.lld1130624.lld3.parkinglot.dtos;

import in.itkaran.lld1130624.lld3.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDto {
    private Long gateId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;
}
