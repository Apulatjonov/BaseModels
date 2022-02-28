package dto;

import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.time.LocalDate;

@Getter
@Setter
public class PassengerDTO extends BaseModel {
    public Long id;
    public UserDTO userId;
    public String surname;
    public String firstName;
    public String middleName;
    public LocalDate birthdate;
    public String gender;
    public String documentType;
    public String countryIssue;
}
