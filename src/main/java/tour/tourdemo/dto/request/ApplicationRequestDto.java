package tour.tourdemo.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ApplicationRequestDto {
    @NotNull
    private String fullName;
    @NotNull
    private String contact;
}
