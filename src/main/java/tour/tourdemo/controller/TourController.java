package tour.tourdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tour.tourdemo.model.Tour;
import tour.tourdemo.service.TourService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/tours")
@RestController
public class TourController {
    private final TourService tourService;

    @GetMapping("/all")
    public List<Tour> getAllTours() {
        return tourService.findAll();
    }

    @GetMapping("/{id}")
    public Tour getTourById(@PathVariable Long id) {
        return tourService.findByID(id);
    }

    @PutMapping("/{id}")
    public Tour updateById(@PathVariable Long id, @RequestBody Tour tour) {
        return tourService.update(id, tour);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tourService.deleteById(id);
    }
}
