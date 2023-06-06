package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Author")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String firtname;
    private String lastname;

}
