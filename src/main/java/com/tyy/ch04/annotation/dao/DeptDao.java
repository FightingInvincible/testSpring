package com.tyy.ch04.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository//标注是持久层，完成数据操作
public class DeptDao {
    public void select(){
        System.out.println("==select");
    }
}
