package com.tyy.ch04.annotation.service;

import com.tyy.ch04.annotation.dao.DeptDao;
import com.tyy.ch04.annotation.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//业务逻辑类
public class DeptService {
     @Autowired//按照类型自动装配
     private DeptDao deptDao;

     public void selectOne(){
         deptDao.select();
         System.out.println("==service");
     }
}
