package tour.tourdemo.dto.request;

import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Data
public class ApplicationRequestDto {
    @NotNull
    private String fullName;
    @NotNull
    private String contact;
    private boolean isDeleted;
}
