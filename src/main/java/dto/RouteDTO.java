package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteDTO {
    public Long id;
    public String name;
    public ServiceDTO service;
    public List<RouteStationDTO> routeStations;
}
