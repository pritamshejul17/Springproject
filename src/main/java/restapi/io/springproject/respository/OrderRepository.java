package restapi.io.springproject.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restapi.io.springproject.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    public  Order findByOrderId(Long orderID);
}
