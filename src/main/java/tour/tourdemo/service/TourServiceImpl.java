package tour.tourdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import tour.tourdemo.model.Tour;
import tour.tourdemo.repository.TourRepository;

public class TourServiceImpl implements TourService {
    @Autowired
    private TourRepository repository;

    @Override
    public Tour save(Tour tour) {
        return repository.save(tour);
    }

    @Override
    public Tour update(Tour tour) {
        return repository.save(tour);
    }

    @Override
    public Tour findByID(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Tour> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
