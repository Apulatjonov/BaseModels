package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepatureDTO {
    public Long id;
    public TrainDTO train;
    public RouteDTO route;
    public Long duration;
    public LocalDate date;
}
