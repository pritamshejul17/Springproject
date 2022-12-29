package restapi.io.springproject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Table ( name = "orders")
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long orderId;
    private LocalDate orderDate;
    private String orderStatus;
    @JsonManagedReference
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn ( name = "order_fk")
    private List<Item> items=new ArrayList<>();

}
