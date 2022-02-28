package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    public Long id;
    public String email;
    public String phoneNumber;
    public String password;
    public String chatId;
    public List<PassengerDTO> passenger;
}
