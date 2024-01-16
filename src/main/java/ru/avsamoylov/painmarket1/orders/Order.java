package ru.avsamoylov.painmarket1.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {
    private  long id;
    private long productId;
    private long clientId;
    private long price;
}
