package responseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponseDTO {
    public Long id;
    public TrainResponseDTO train;
    public StationResponseDTO firstStationId;
    public StationResponseDTO secondStationId;
    public Double price;
    public String duration;
}
