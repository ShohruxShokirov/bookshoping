package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Genres_GEN")
    @SequenceGenerator(name = "Genres_GEN", sequenceName = "Genres_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
