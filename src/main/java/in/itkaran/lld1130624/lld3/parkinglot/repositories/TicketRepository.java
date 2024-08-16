package in.itkaran.lld1130624.lld3.parkinglot.repositories;

import in.itkaran.lld1130624.lld3.parkinglot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new TreeMap<>();
    private Long previousTicketId = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == null) {
            previousTicketId += 1;
            ticket.setId(previousTicketId);
        }
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }

    public Ticket findTicketById(Long ticketId) {
        return ticketMap.get(ticketId);
    }
}
