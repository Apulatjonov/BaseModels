package dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DepatureDTO {
    public Long id;
    public TrainDTO train;
    public RouteDTO route;
    public Long duration;
    public LocalDate date;
}
