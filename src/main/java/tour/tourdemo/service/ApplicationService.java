package tour.tourdemo.service;

import tour.tourdemo.model.Application;
import java.util.List;

public interface ApplicationService {
    Application save(Application tour);

    Application findById(Long id);

    List<Application> findAll();

    void deleteById(Long id);
}
