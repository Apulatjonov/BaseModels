package userRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservedSeatDto {

    private Long passengerId;
    private int seatOrdinal;
}
