package com.example.JavaCore_4.Shop;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@ToString
public class Order {

    private Customer customer;
    private Product product;
    private int quantity;


}