package tour.tourdemo.dto.response;

import java.util.Set;
import lombok.Data;
import tour.tourdemo.model.Role;

@Data
public class UserResponseDto {
    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;
}
