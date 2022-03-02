package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.time.LocalDate;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PassengerDTO extends BaseModel {
    public Long id;
    public UserDTO user;
    public String surname;
    public String firstName;
    public String middleName;
    public LocalDate birthDate;
    public String gender;
    public String documentType;
    public String countryIssue;
}
