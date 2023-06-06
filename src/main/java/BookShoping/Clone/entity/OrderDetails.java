package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OrderDetails_GEN")
    @SequenceGenerator(name = "OrderDetails_GEN", sequenceName = "OrderDetails_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer bookid;
    private Integer orderId;
    private Integer amount;

}
