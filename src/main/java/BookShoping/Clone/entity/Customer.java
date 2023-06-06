package BookShoping.Clone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Customer_GEN")
    @SequenceGenerator(name = "Customer_GEN", sequenceName = "Customer_SEQ")
    @Column(name = "id", nullable = false)
    private Integer id;

    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private String city;
    private String street;
    private String phoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
