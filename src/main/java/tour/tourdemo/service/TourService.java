package tour.tourdemo.service;

import tour.tourdemo.dto.request.TourRequestDto;
import tour.tourdemo.model.Tour;

import java.util.List;

public interface TourService {
    Tour save(Tour tour);

    Tour update(Long id, TourRequestDto dto);

    Tour findByID(Long id);

    List<Tour> findAll();

    void deleteById(Long id);
}
