package restapi.io.springproject.dto;

import lombok.*;
import restapi.io.springproject.model.Item;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
    private List<Item> items;
}
