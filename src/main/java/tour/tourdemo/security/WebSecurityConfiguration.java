package tour.tourdemo.security;

import static org.springframework.security.config.Customizer.withDefaults;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfiguration {
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    //Deprecated
//    @Autowired
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        auth -> auth
                                .requestMatchers("/applications/admin/**",
                                        "tours/admin/**",
                                        "/authentication/**")
                                .authenticated()
                                .anyRequest()
                                .permitAll()
                )
                .formLogin(withDefaults())
                .httpBasic(withDefaults())
                .userDetailsService(userDetailsService)
                .build();
    }
}
