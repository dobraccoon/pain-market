package ru.avsamoylov.painmarket1.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.avsamoylov.painmarket1.product.Customer;

import java.util.Random;
@Repository
@AllArgsConstructor
public class CustomerRepository {
    public Customer saveCustomer(Customer customer) {
        return new Customer(
                new Random().nextLong(), customer.getEmail()
        );
    }
}
