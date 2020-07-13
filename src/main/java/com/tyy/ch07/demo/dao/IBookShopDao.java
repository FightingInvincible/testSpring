package com.tyy.ch07.demo.dao;

import com.tyy.ch07.demo.exception.AccountException;
import com.tyy.ch07.demo.exception.BookStockException;

public interface IBookShopDao {

    //根据bookId获取书的价格
    public int selectPrice(int bookId);
    //根据bookId更新库存
    public void updateStock(int bookId) throws BookStockException;
    //根据username,price更新账户余额
    public void updateBalance(String username, int price) throws AccountException;

}