package dto;

import lombok.Data;

@Data
public class RouteStationDTO {
    private Long id;
    private Long route;
    private Long station;
    private Integer ordinal;
}
