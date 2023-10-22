package tour.tourdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tour.tourdemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getByRoleName(String roleName);
}
