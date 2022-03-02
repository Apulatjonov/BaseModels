package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketDTO {
    public Long id;
    public OrderDTO order;
    public PassengerDTO passenger;
    public CoachDTO coach;
    public Integer seatOrdinal;
    public DepatureDTO depature;
    public ServiceDTO service;
}
