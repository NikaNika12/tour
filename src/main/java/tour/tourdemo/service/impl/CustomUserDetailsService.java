package tour.tourdemo.service.impl;

import tour.tourdemo.model.Role;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.User;
import tour.tourdemo.service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        org.springframework.security.core.userdetails.User.UserBuilder builder
                = org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.getPassword());
        builder.authorities(user.getRoles().stream()
                .map(Role::getRoleName)
                .map(String::valueOf)
                .toArray(String[]::new));
        return builder.build();
    }
}