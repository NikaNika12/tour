package tour.tourdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tour.tourdemo.dto.request.UserRequestDto;
import tour.tourdemo.dto.response.UserResponseDto;
import tour.tourdemo.mapper.UserMapper;
import tour.tourdemo.service.UserService;

@RequiredArgsConstructor
@RequestMapping("/authentication")
@RestController
public class AuthenticationController {
    private final UserService service;
    private final UserDetailsService userDetailsService;
    private final UserMapper mapper;

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody UserRequestDto dto) {
        return mapper.toDto(service.save(mapper.toModel(dto)));
    }

    //Test endpoint
    @GetMapping("/{username}")
    public void getUser(@PathVariable String username) {
        System.out.println(service.findByUsername(username));
        System.out.println(userDetailsService.loadUserByUsername(username).toString());
    }
}
