package tour.tourdemo.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tour.tourdemo.dto.request.ApplicationRequestDto;
import tour.tourdemo.dto.response.ApplicationResponseDto;
import tour.tourdemo.mapper.ApplicationMapper;
import tour.tourdemo.service.ApplicationService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/applications")
public class ApplicationController {
    private final ApplicationService applicationService;
    private final ApplicationMapper mapper;

    @GetMapping("/findAll")
    public List<ApplicationResponseDto> findAll() {
        return applicationService.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    @PostMapping("/crete")
    public ApplicationResponseDto crete(@RequestBody ApplicationRequestDto application) {
        return mapper.toDto(applicationService.save(mapper.toModel(application)));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        applicationService.deleteById(id);
    }
}
