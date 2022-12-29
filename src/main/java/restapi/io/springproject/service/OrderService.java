package restapi.io.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.io.springproject.dto.OrderDto;
import restapi.io.springproject.model.Order;
import restapi.io.springproject.respository.OrderRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void save(OrderDto orderDto){
        LocalDate date=LocalDate.now();

        Order order=new Order();
        order.setOrderDate(date);
        order.setOrderStatus("New");
        order.setItems(orderDto.getItems());

        orderRepository.save(order);
    }
    public Order findById(Long orderId) {
        return orderRepository.findByOrderId(orderId);
    }
    public List<Order> findAllOrders(){
        return orderRepository.findAll().stream().toList();
    }
}
