package com.example.JavaCore_4.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductException extends RuntimeException {

    public ProductException(String message) {
        super(message);
    }
}