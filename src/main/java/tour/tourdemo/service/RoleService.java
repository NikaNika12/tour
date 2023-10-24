package tour.tourdemo.service;

import tour.tourdemo.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(Role.RoleName roleName);
}
