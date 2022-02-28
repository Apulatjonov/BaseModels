package responseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteResponseDTO {
    public Long id;
    public String name;
    public ServiceResponseDTO service;
}
