package ru.avsamoylov.painmarket1.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.avsamoylov.painmarket1.product.Order;

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
