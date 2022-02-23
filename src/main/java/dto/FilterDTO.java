package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterDTO {
    public String fromStation;
    public String toStation;
    public String date;
}
