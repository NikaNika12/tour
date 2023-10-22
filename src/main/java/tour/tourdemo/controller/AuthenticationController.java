package tour.tourdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tour.tourdemo.model.User;
import tour.tourdemo.service.UserService;

@RequiredArgsConstructor
@RequestMapping("/authentication")
@RestController
public class AuthenticationController {
    private final UserService service;
    private final UserDetailsService userDetailsService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.save(user);
    }

    //Test endpoint
    @GetMapping("/{username}")
    public void getUser(@PathVariable String username) {
        System.out.println(service.findByUsername(username));
        System.out.println(userDetailsService.loadUserByUsername(username).toString());
    }
}
