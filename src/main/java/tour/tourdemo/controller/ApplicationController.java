package tour.tourdemo.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tour.tourdemo.model.Application;
import tour.tourdemo.service.ApplicationService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/application")
public class ApplicationController {
    private final ApplicationService applicationService;

    @GetMapping("/findAll")
    public List<Application> getAll() {
        return applicationService.findAll();
    }

    @PostMapping("/save")
    public Application save(@RequestBody Application application) {
        return applicationService.save(application);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        applicationService.deleteById(id);
    }
}
