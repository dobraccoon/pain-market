package ru.avsamoylov.painmarket1.products;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.avsamoylov.painmarket1.products.Product;
import ru.avsamoylov.painmarket1.products.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public Product create(@RequestBody Product product) {
        return productRepository.create(product);
    }
}
