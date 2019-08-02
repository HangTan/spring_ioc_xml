package com.lion.ioc.demo1;

public class UserServiceImpl implements UserService {

    // 添加属性：
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello Spring" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
