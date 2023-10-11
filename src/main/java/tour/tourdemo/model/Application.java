package tour.tourdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "applications")
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String contact;
}
