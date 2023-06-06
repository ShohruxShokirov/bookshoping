package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Order_GEN")
    @SequenceGenerator(name = "Order_GEN", sequenceName = "Order_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

   private LocalDate date;
   private Integer customerId;
   private Integer shipperId;
   private String location;

}
