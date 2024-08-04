package in.itkaran.lld1130624.lld3.parkinglot.dtos;

import in.itkaran.lld1130624.lld3.parkinglot.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
