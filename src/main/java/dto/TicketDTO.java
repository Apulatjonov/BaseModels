package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDTO {
    public Long id;
    public OrderDTO order;
    public PassengerDTO passenger;
    public CoachDTO coach;
    public Integer seatOrdinal;
    public DepatureDTO depature;
    public ServiceDTO service;
}
