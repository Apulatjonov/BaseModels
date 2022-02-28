package responseDto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DepatureResponseDTO {
    public Long id;
    public TrainResponseDTO train;
    public RouteResponseDTO route;
    public Long duration;
    public Date date;
}
