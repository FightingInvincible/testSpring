package com.tyy.ch07.demo.service;

import com.tyy.ch07.demo.exception.AccountException;
import com.tyy.ch07.demo.exception.BookStockException;

public interface IBookShopService {

    //通过账户名及书号购买书
    public void purchase(String username, int bookId) throws BookStockException, AccountException;
}
