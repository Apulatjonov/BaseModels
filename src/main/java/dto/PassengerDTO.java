package dto;

import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.util.Date;

@Getter
@Setter
public class PassengerDTO extends BaseModel {
    public Long id;
    public Long user_id;
    public String surname;
    public String first_name;
    public String middle_name;
    public Date birthdate;
    public Gender gender;
    public String document_type;
    public String country_issue;
}
