package responseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoachResponseDTO {
    public Long id;
    public ClassResponseDTO classDTO;
    public TrainResponseDTO trainDTO;
    public Integer ordinal;
    public String type;
    public Integer seatNumber;
}
