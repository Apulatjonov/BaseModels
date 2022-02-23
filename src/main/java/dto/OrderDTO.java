package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class OrderDTO {
    public UserDTO user;
    public Double total;
    public Date orderDate;
    public Set<TicketDTO> tickets;
}
