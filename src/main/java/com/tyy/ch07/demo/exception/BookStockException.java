package com.tyy.ch07.demo.exception;

public class BookStockException extends  RuntimeException {

    public BookStockException() {
    }

    public BookStockException(String message) {
        super(message);
    }
}
