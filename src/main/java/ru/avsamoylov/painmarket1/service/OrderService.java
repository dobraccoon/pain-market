package ru.avsamoylov.painmarket1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avsamoylov.painmarket1.product.Order;
import ru.avsamoylov.painmarket1.repository.OrderRepository;

@Service
@AllArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
       return orderRepository.createOrder(order);
    }
}
