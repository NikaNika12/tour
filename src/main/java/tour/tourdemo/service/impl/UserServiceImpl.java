package tour.tourdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.User;
import tour.tourdemo.repository.UserRepository;
import tour.tourdemo.service.UserService;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User save(User user) {
        user.setPassword(getPasswordEncoder().encode(user.getPassword()));
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

    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
