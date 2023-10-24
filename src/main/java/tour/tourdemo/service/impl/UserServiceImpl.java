package tour.tourdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.Role;
import tour.tourdemo.model.User;
import tour.tourdemo.repository.RoleRepository;
import tour.tourdemo.repository.UserRepository;
import tour.tourdemo.service.UserService;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;

    @Override
    public User save(User user) {
        Role role = roleRepository.getByRoleName(Role.RoleName.ADMIN);
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRoles(Set.of(role));
        return repository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
