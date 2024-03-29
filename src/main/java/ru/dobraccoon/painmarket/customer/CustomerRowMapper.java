package ru.dobraccoon.painmarket.customer;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Customer(
                rs.getLong("id"),
                rs.getString("image_url"),
                rs.getBoolean("law_entity"),
                rs.getString("email"),
                rs.getInt("phone_country_code"),
                rs.getInt("phone_number"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("password"),
                rs.getString("city"),
                rs.getString("street"),
                rs.getInt("city_index")
        );
    }
}
