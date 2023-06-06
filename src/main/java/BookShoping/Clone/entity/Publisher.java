package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Publisher_GEN")
    @SequenceGenerator(name = "Publisher_GEN", sequenceName = "Publisher_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;

}
