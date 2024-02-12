package ru.avsamoylov.painmarket.products;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductRepository {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Long saveProduct(Product product) {
        String sql = "INSERT INTO products(id, name, price, discount) VALUES " +
                "(nextval('product_sequence'), ':name', :price, :discount;";
        return namedParameterJdbcTemplate.queryForObject(sql,
                new MapSqlParameterSource()
                        .addValue("name", product.getName())
                        .addValue("price", product.getPrice())
                        .addValue("discount", product.getDiscount()),
                Long.class);
    }

    public Product findByProductId(long id) {
        String sql = "SELECT * FROM products WHERE id = :id;";
        return namedParameterJdbcTemplate.queryForObject(sql,
                new MapSqlParameterSource("id", id),
                new ProductRowMapper()
        );
    }
}
