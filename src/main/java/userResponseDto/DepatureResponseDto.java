package userResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import responseDto.DepatureResponseDTO;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepatureResponseDto {

    private DepatureResponseDTO detail;
    private String depature;
    private String arrival;
    private String duration;
    private List<ClassSeat> classSeats;

}
