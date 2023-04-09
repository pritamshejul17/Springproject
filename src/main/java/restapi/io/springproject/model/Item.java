package restapi.io.springproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Table (name = "items")
public class Item {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long itemId;
    private String itemName;
    private  Long itemUnitPrice;
    private Long itemQuantity;
}
