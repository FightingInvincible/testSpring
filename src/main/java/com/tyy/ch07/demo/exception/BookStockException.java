package com.tyy.ch07.demo.exception;

/**
 * 只有RuntimeException并未被try cache到才能进行事务回滚
 */
public class BookStockException extends  RuntimeException {

    public BookStockException() {
    }

    public BookStockException(String message) {
        super(message);
    }
}
