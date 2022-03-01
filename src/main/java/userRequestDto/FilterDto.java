package userRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterDto {

    private String fromStation;
    private String toStation;
    private String depatureDate;
}
