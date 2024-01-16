package ru.avsamoylov.painmarket1.customers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avsamoylov.painmarket1.customers.Customer;
import ru.avsamoylov.painmarket1.customers.CustomerController;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerController.CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.saveCustomer(customer);
    }

}
