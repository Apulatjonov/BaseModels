package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDTO {
    public Long id;
    public String username;
    public String password;
    public String role;
}
