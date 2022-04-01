package com.geek.homework4.two;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestKind {
    @Test
    public void fun(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User bean = applicationContext.getBean(User.class);
        Cat cat = bean.getCat();
        cat.shot();
    }
    @Test
    public void fun1(){

            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            Cat cat = applicationContext.getBean(Cat.class);
    }

}
