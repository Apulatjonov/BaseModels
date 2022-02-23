package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoachDTO {
    public Long classId;
    public Long trainId;
    public Integer ordinal;
    public String type;
    public Integer seatNumber;
}
