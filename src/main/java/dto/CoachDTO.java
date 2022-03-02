package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoachDTO {
    public Long id;
    public ClassDTO clazz;
    public TrainDTO train;
    public Integer ordinal;
    public String type;
    public Integer seatNumber;
}
