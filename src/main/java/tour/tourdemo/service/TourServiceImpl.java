package tour.tourdemo.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
        return repository.save(tour);
    }

    @Override
    public Tour findByID(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Tour> findAll() {
        //Hardcode для тесту
        Tour tour = new Tour();
        tour.setId(1L);
        tour.setTitle("TestYogaTour");
        tour.setDescription("This tour help you relax and reload your mind");
        tour.setPrice(1000);
        tour.setLocation("Turkey");
        tour.setDate("01-03-2023");
        tour.setType("Yoga-tour");
        return List.of(tour);

        // main code
//        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
