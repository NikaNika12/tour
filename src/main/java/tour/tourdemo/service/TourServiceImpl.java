package tour.tourdemo.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.Tour;
import tour.tourdemo.repository.TourRepository;

@RequiredArgsConstructor
@Service
public class TourServiceImpl implements TourService {
    private final TourRepository repository;

    @Override
    public Tour save(Tour tour) {
        return repository.save(tour);
    }

    @Override
    public Tour update(Long id, Tour tour) {
        tour.setId(id);
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
