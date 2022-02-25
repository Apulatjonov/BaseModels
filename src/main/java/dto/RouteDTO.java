package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteDTO {
    public Long id;
    public String name;
    public ServiceDTO service;
}
