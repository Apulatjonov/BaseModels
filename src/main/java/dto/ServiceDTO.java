package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDTO {
    public Long trainId;
    public Long firstStationId;
    public Long secondStationId;
    public Double price;
    public String duration;
}
