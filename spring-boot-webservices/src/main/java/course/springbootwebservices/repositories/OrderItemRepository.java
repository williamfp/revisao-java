package course.springbootwebservices.repositories;

import course.springbootwebservices.entities.OrderItem;
import course.springbootwebservices.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
