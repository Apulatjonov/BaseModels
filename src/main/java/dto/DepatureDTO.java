package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DepatureDTO {
    public Long id;
    public TrainDTO trainId;
    public RouteDTO routeId;
    public Long duration;
    public Date date;
}
