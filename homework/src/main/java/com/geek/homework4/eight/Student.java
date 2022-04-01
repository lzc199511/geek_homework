package com.geek.homework4.eight;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable, ApplicationContextAware {


    private int id;
    private String name;

    private ApplicationContext applicationContext;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void init(){
        System.out.println("hello...........");
    }

    public com.geek.homework4.ten.Student create(){

        this.applicationContext.getBeanDefinitionNames();
        com.geek.homework4.ten.Student s = new com.geek.homework4.ten.Student(101,"KK101");
        return s;
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
