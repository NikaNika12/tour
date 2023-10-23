package tour.tourdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tour.tourdemo.dto.request.TourRequestDto;
import tour.tourdemo.dto.response.TourResponseDto;
import tour.tourdemo.mapper.TourMapper;
import tour.tourdemo.service.TourService;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/tours")
@RestController
public class TourController {
    private final TourService tourService;
    private final TourMapper mapper;

    @PostMapping("/admin/create")
    public TourResponseDto create(@RequestBody TourRequestDto dto) {
        return mapper.toDto(tourService.save(mapper.toModel(dto)));
    }

    @GetMapping("/findAll")
    public List<TourResponseDto> findAll() {
        return tourService.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public TourResponseDto getById(@PathVariable Long id) {
        return mapper.toDto(tourService.findByID(id));
    }

    @PutMapping("/admin/{id}")
    public TourResponseDto update(@PathVariable Long id, @RequestBody TourRequestDto dto) {
        return mapper.toDto(tourService.update(id, mapper.toModel(dto)));
    }

    @DeleteMapping("/admin/{id}")
    public void deleteById(@PathVariable Long id) {
        tourService.deleteById(id);
    }
}
