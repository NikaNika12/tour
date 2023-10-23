package tour.tourdemo.dto.response;

import lombok.Data;

@Data
public class ApplicationResponseDto {
    private Long id;
    private String fullName;
    private String contact;
    private boolean isDeleted;
}
