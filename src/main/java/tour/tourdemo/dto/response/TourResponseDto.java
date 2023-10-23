package tour.tourdemo.dto.response;

import lombok.Data;

@Data
public class TourResponseDto {
    private Long id;
    private String title;
    private String description;
    private String date;
    private Integer price;
    private String location;
    private String type;
    private boolean isDeleted;
}
