package tour.tourdemo.service;

import tour.tourdemo.model.User;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    void deleteById(Long id);
}
