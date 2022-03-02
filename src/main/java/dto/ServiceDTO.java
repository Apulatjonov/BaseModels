package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDTO {
    public Long id;
    public TrainDTO train;
    public StationDTO firstStation;
    public StationDTO secondStation;
    public Double price;
    public String duration;
}
