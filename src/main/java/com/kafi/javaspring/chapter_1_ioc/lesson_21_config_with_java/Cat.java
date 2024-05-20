package com.kafi.javaspring.chapter_1_ioc.lesson_21_config_with_java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("prototype")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    public void init() {
        System.out.println("Class Cat: init method");
    }

    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
