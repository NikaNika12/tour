package tour.tourdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tour.tourdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
