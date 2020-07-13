package com.tyy.ch07.demo.service;

import com.tyy.ch07.demo.exception.AccountException;
import com.tyy.ch07.demo.exception.BookStockException;

import java.util.List;

public interface ICashierService {

    //客户的结账
    public void cash(String username, List<Integer> bookIds) throws AccountException, BookStockException;
}