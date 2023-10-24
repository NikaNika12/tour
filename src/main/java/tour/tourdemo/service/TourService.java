package tour.tourdemo.service;

import java.util.List;
import tour.tourdemo.model.Tour;

public interface TourService {
    Tour save(Tour tour);

    Tour update(Long id, Tour tour);

    Tour findByID(Long id);

    List<Tour> findAll();

    void deleteById(Long id);
}
