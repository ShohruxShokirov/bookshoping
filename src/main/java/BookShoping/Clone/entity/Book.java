package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
   private String name;
   private LocalDate year;
   private Integer publishedId;
   private Integer authorId;
   private  Double price;
}
