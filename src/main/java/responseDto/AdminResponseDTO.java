package responseDto;

import dto.Roles;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminResponseDTO {
    public Long id;
    public String username;
    public String password;
    public Roles role;
}
