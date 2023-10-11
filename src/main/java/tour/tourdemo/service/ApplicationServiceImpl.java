package tour.tourdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tour.tourdemo.model.Application;
import tour.tourdemo.repository.ApplicationRepository;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository repository;

    @Override
    public Application save(Application tour) {
        return repository.save(tour);
    }

    @Override
    public List<Application> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
