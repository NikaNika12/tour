package tour.tourdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tour.tourdemo.repository.UserRepository;

@SpringBootApplication
public class TourDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TourDemoApplication.class, args);
	}
}
