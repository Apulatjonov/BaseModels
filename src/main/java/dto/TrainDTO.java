package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainDTO {
    public Long id;
    public String name;
    public String model;
    public List<CoachDTO> coaches;
}
