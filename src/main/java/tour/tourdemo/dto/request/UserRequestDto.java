package tour.tourdemo.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequestDto {
    @NotNull
    private String username;
    @NotNull
    private String password;
}
