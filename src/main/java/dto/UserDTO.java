package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    public Long id;
    public String email;
    public String phoneNumber;
    public String password;
    public String chatId;
    public PassengerDTO passenger;
}
