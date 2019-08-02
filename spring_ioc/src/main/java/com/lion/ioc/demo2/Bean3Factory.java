package com.lion.ioc.demo2;

/**
 * Bean3的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3");
        return new Bean3();
    }
}
