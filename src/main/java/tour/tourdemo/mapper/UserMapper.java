package tour.tourdemo.mapper;

import org.mapstruct.Mapper;
import tour.tourdemo.config.MapperConfig;
import tour.tourdemo.dto.request.UserRequestDto;
import tour.tourdemo.dto.response.UserResponseDto;
import tour.tourdemo.model.User;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toDto(User user);
    User toModel(UserRequestDto dto);
}
