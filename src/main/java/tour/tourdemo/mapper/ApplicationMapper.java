package tour.tourdemo.mapper;

import org.mapstruct.Mapper;
import tour.tourdemo.config.MapperConfig;
import tour.tourdemo.dto.request.ApplicationRequestDto;
import tour.tourdemo.dto.response.ApplicationResponseDto;
import tour.tourdemo.model.Application;

@Mapper(config = MapperConfig.class)
public interface ApplicationMapper {
    ApplicationResponseDto toDto(Application application);
    Application toModel(ApplicationRequestDto requestDto);
}
