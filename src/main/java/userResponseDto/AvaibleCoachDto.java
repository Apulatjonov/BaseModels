package userResponseDto;

import dto.CoachDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaibleCoachDto {

    private List<CoachDTO> coachList;
}
