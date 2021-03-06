package com.lion.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public Man() {
        System.out.println("第一步：初始化。。。");
    }

    public void setup() {
        System.out.println("第七步：执行自己的初始化方法。 ");
    }

    public void teardown() {
        System.out.println("第十一步：执行自己配置的销毁方法Man被销毁了。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("第二步：设置属性");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置Bean的名称" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步，了解工厂信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步，属性设置后");
    }

    public void run() {
        System.out.println("第九步，执行自身业务方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步，执行Spring的销毁方法");
    }
}
