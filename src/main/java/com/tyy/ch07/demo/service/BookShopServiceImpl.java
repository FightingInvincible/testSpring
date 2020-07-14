package com.tyy.ch07.demo.service;


import javax.annotation.Resource;
import com.tyy.ch07.demo.dao.IBookShopDao;
import com.tyy.ch07.demo.exception.AccountException;
import com.tyy.ch07.demo.exception.BookStockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.sql.SQLException;

@Service("bookShopService")
public class BookShopServiceImpl implements IBookShopService {
    @Resource
    private IBookShopDao bookShopDao;

    //通过账户名及书号购买书
    //支持注解式事务管理
    //@Transactional//回滚到头 钱不够 一本书也买不了
    //重写 能买一本就买一本

    /**
     * REQUIRED把整个封装为一个事务；REQUIRES_NEW把原事务挂起  重开事务  相当于分割原事务
     */
    @Transactional(propagation= Propagation.REQUIRES_NEW,
            isolation= Isolation.READ_COMMITTED, //避免脏读  一般不需修改
            rollbackFor={IOException.class, SQLException.class},//回滚异常
            noRollbackFor={ArithmeticException.class},//异常不回滚
            readOnly=false,//更新数据  true就只读 只能查询数据
            timeout=3)//超时 超时了就回滚
    @Override
    public void purchase(String username, int bookId) throws BookStockException, AccountException {
        int price = bookShopDao.selectPrice(bookId);
        //一旦添加了事务管理，当前两项操作要么都做，要么都不做
        //买书后，更新库存
        bookShopDao.updateStock(bookId);
        //根据提供会员信息，修改余额
        bookShopDao.updateBalance(username, price);
    }

}
