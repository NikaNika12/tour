package tour.tourdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.Role;
import tour.tourdemo.repository.RoleRepository;
import tour.tourdemo.service.RoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Role getByName(String roleName) {
        return repository.getByRoleName(roleName);
    }
}
