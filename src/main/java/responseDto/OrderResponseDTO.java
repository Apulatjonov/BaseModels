package responseDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class OrderResponseDTO {
    public Long id;
    public UserResponseDTO user;
    public Double total;
    public LocalDate orderDate;
    public Set<TicketResponseDTO> tickets;
}
