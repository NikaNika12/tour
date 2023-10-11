package tour.tourdemo.service;

import tour.tourdemo.model.Tour;

import java.util.List;

public interface TourService {
    Tour save(Tour tour);

    Tour update(Tour tour);

    Tour findByID(Long id);

    List<Tour> findAll();

    void deleteById(Long id);
}
