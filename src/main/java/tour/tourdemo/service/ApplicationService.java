package tour.tourdemo.service;

import tour.tourdemo.model.Application;
import java.util.List;

public interface ApplicationService {
    Application save(Application tour);

    List<Application> findAll();

    void deleteById(Long id);
}
