package com.lion.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围测试
 */
public class SpringDemo3 {

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");
        // 地址一样，即单例     scope="singleton"默认为singleton
        // 将applicationContext.xml 里的scope="prototype" 即为多例 打印出的地址将不同
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man)applicationContext.getBean("man");
        man.run();
        applicationContext.close();

    }

    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.findAll();
        userDao.save();
        userDao.delete();
        userDao.update();

    }
}
