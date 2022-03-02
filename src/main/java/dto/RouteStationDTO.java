package dto;

import lombok.Data;

@Data
public class RouteStationDTO {
    private Long id;
    private RouteDTO route;
    private StationDTO station;
    private Integer ordinal;
}
