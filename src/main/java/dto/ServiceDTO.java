package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceDTO {
    public Long id;
    public TrainDTO train;
    public StationDTO firstStation;
    public StationDTO secondStation;
    public Double price;
    public String duration;
}
