package restapi.io.springproject.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restapi.io.springproject.dto.OrderDto;
import restapi.io.springproject.model.Item;
import restapi.io.springproject.model.Order;
import restapi.io.springproject.service.OrderService;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

@RestController
@RequestMapping ("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping ("/create")
    public ResponseEntity<Void> createOrders(@RequestBody OrderDto orderDto){
        orderService.save(orderDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping ("/{orderId}")
    public ResponseEntity<Order> findOrdersById(@PathVariable Long orderId){
        return ResponseEntity.status(OK)
                .body(orderService.findById(orderId));
    }
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.status(OK)
                .body(orderService.findAllOrders());
    }
}
