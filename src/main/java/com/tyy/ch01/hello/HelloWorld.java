package com.tyy.ch01.hello;

import javax.xml.bind.SchemaOutputResolver;

public class HelloWorld {
    private String username;

    public HelloWorld() {
    }

    public HelloWorld(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "username='" + username + '\'' +
                '}';
    }
    public void work(){
        System.out.println("work");
    }
}
