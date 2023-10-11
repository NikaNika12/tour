package tour.tourdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tour.tourdemo.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
