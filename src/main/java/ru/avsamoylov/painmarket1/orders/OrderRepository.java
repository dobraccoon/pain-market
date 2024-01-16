package ru.avsamoylov.painmarket1.orders;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.avsamoylov.painmarket1.orders.Order;

import java.util.Random;

@Repository
@AllArgsConstructor
public class OrderRepository {

    public Order createOrder(Order order) {
        return new Order(
                new Random().nextLong(), order.getProductId(), order.getClientId(), order.getPrice()
        );
    }
}
