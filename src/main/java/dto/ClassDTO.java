package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassDTO {
    public Long id;
    public String status;
    public String type;
    public Double percentagePrice;
}
