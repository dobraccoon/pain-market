package ru.avsamoylov.painmarket1.customers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
       return service.saveCustomer(customer);
    }

    @Repository
    @AllArgsConstructor
    public static class CustomerRepository {
        public Customer saveCustomer(Customer customer) {
            return new Customer(
                    new Random().nextLong(), customer.getEmail()
            );
        }
    }
}
