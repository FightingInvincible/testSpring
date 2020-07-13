package com.tyy.ch07.demo.exception;

public class AccountException extends  RuntimeException {

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}