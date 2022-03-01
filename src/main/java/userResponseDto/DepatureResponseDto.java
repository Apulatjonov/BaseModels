package userResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import responseDto.DepatureResponseDTO;
import responseDto.ServiceResponseDTO;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepatureResponseDto {

    private DepatureResponseDTO detail;
    private ServiceResponseDTO service;
    private String depature;
    private String arrival;
    private List<ClassSeat> classSeats;

}
