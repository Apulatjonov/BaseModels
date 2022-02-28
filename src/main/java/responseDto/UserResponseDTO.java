package responseDto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    public Long id;
    public String email;
    public String phoneNumber;
    public String password;
    public String chatId;
    public List<PassengerResponseDTO> passenger;
}
