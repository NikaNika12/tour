package tour.tourdemo.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ApplicationRequestDto {
    private String fullName;
    private String contact;
}
