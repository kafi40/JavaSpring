package com.kafi.javaspring.chapter_1_ioc.lesson_22_config_with_java;

import org.springframework.context.annotation.Scope;

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
