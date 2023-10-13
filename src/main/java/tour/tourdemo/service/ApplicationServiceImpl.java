package tour.tourdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.Application;
import tour.tourdemo.repository.ApplicationRepository;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository repository;

    @Override
    public Application save(Application tour) {
        return repository.save(tour);
    }

    @Override
    public Application findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Application> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        Application application = findById(id);
        application.setDelete(true);
        repository.save(application);
    }
}
