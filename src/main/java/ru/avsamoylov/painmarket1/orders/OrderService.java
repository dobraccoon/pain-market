package ru.avsamoylov.painmarket1.orders;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avsamoylov.painmarket1.orders.Order;
import ru.avsamoylov.painmarket1.orders.OrderRepository;

@Service
@AllArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
       return orderRepository.createOrder(order);
    }
}
