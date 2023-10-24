package tour.tourdemo.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TourRequestDto {
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String date;
    @NotNull
    private Integer price;
    @NotNull
    private String location;
    @NotNull
    private String type;
    private boolean isDeleted;
}
