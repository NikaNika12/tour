package tour.tourdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tour.tourdemo.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {
}
