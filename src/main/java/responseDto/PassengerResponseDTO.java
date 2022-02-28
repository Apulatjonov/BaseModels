package responseDto;

import dto.Gender;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.time.LocalDate;

@Getter
@Setter
public class PassengerResponseDTO extends BaseModel {
    public Long id;
    public UserResponseDTO user;
    public String surname;
    public String firstName;
    public String middleName;
    public LocalDate birthdate;
    public Gender gender;
    public String documentType;
    public String countryIssue;
}
