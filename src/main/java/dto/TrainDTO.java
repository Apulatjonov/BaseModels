package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TrainDTO {
    public Long id;
    public String name;
    public String model;
    public List<CoachDTO> coaches;
}
