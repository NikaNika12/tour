package tour.tourdemo.mapper;

import org.mapstruct.Mapper;
import tour.tourdemo.config.MapperConfig;
import tour.tourdemo.dto.TourRequestDto;
import tour.tourdemo.dto.TourResponseDto;
import tour.tourdemo.model.Tour;

@Mapper(config = MapperConfig.class)
public interface TourMapper {
    TourResponseDto toDto(Tour tour);
    Tour toModel(TourRequestDto requestDto);
}
