package tour.tourdemo.mapper;

import org.mapstruct.Mapper;
import tour.tourdemo.config.MapperConfig;
import tour.tourdemo.dto.response.TourResponseDto;
import tour.tourdemo.dto.request.TourRequestDto;
import tour.tourdemo.model.Tour;

@Mapper(config = MapperConfig.class)
public interface TourMapper {
    TourResponseDto toDto(Tour tour);
    Tour toModel(TourRequestDto requestDto);
}
