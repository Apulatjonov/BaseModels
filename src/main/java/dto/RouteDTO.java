package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RouteDTO {
    public Long id;
    public String name;
    public ServiceDTO service;
    public List<RouteStationDTO> routeStations;
}
