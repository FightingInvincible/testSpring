package com.tyy.ch04.annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//加入ioc容器中
@Component
public class Dept {
    @Value(value = "8")
    private Integer id;
    @Value(value = "研发部")
    private String name;

    public Dept() {
    }

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
