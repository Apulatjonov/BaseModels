package userRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long userId;
    private Long depatureId;
    private Long coachId;
    private List<ReservedSeatDto> passengers;
}
