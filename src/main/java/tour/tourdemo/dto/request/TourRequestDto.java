package tour.tourdemo.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TourRequestDto {
    private String title;
    private String description;
    private String date;
    private Integer price;
    private String location;
    private String type;
}
