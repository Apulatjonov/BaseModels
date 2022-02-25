package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterResponseDTO {
    public Long id;
    public String startTime;
    public String endTime;
    public String duration;
    public String fromCity;
    public String toCity;
}
