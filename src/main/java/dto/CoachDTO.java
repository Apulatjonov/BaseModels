package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoachDTO {
    public Long id;
    public ClassDTO clazz;
    public TrainDTO train;
    public Integer ordinal;
    public String type;
    public Integer seatNumber;
}
