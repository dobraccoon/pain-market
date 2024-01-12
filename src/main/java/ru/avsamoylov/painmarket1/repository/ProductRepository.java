package ru.avsamoylov.painmarket1.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.avsamoylov.painmarket1.product.Product;

import java.util.Random;

@Repository
@AllArgsConstructor
public class ProductRepository {

    public Product create(Product product) {
        return new Product(
                new Random().nextLong(), product.getName(), product.getPrice(), product.getDiscount());
    }
}
