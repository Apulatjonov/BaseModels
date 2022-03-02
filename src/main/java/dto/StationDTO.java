package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StationDTO {
    public Long id;
    public String name;
    public String location;
    public List<RouteDTO> routes;
}
