package receiveDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class CoachReceiveDTO {
    public Long id;
    public String className;
    public Long trainId;
    public Integer ordinal;
    public String type;
    public Integer seatNumber;
}
