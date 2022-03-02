package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilterDTO {
    public Long id;
    public StationDTO fromStation;
    public StationDTO toStation;
    public String date;
}
