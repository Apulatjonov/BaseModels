package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDTO {
    public Long id;
    public OrderDTO orderId;
    public PassengerDTO passengerId;
    public CoachDTO coachId;
    public Integer seatOrdinal;
    public DepatureDTO depatureId;
    public ServiceDTO serviceId;
}
