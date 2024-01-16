package ru.avsamoylov.painmarket1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avsamoylov.painmarket1.product.Customer;
import ru.avsamoylov.painmarket1.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.saveCustomer(customer);
    }

}
