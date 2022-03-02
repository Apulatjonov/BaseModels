package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    public Long id;
    public UserDTO user;
    public Double total;
    public LocalDate orderDate;
    public Set<TicketDTO> tickets;
}
