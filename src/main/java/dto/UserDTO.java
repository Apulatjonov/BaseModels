package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    public String email;
    public String phoneNumber;
    public String password;
    public Long passengerId;
}
