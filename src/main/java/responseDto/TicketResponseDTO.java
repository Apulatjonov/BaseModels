package responseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketResponseDTO {
    public Long id;
    public OrderResponseDTO order;
    public PassengerResponseDTO passenger;
    public CoachResponseDTO coach;
    public Integer seatOrdinal;
    public DepatureResponseDTO depature;
    public ServiceResponseDTO service;
}
