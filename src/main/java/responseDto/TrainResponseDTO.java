package responseDto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TrainResponseDTO {
    public Long id;
    public String name;
    public String model;
    public List<CoachResponseDTO> coaches;
}
