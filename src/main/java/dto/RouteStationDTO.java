package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteStationDTO {
    private Long id;
    private RouteDTO route;
    private StationDTO station;
    private Integer ordinal;
}
