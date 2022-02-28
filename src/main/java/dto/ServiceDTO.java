package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDTO {
    public Long id;
    public TrainDTO trainId;
    public StationDTO firstStationId;
    public StationDTO secondStationId;
    public Double price;
    public String duration;
}
