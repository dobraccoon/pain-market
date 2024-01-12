package ru.avsamoylov.painmarket1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avsamoylov.painmarket1.product.Product;
import ru.avsamoylov.painmarket1.service.ProductService;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
}
