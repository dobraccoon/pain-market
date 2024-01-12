package ru.avsamoylov.painmarket1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avsamoylov.painmarket1.product.Customer;
import ru.avsamoylov.painmarket1.service.CustomerService;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
       return service.saveCustomer(customer);
    }
}
