package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    public Long id;
    public String email;
    public String phoneNumber;
    public String password;
    public String chatId;
    public List<PassengerDTO> passenger;
    public List<OrderDTO> orders;
}
