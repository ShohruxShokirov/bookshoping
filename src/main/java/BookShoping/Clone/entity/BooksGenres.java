package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BooksGenres


{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

   private Integer bookId;
   private Integer genresId;

}
