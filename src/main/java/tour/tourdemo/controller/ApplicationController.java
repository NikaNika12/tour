package tour.tourdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tour.tourdemo.model.Application;
import tour.tourdemo.service.ApplicationService;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/app")
@RestController
public class ApplicationController {
    private final ApplicationService applicationService;
    @GetMapping("/all")
    public List<Application> getAllApp() {
        return applicationService.findAll();
    }

    @GetMapping("/{id}")
    public Application save(@RequestBody Application application) {
        return applicationService.save(application);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        applicationService.deleteById(id);
    }
}
