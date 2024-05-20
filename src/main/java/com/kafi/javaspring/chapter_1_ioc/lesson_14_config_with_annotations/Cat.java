package com.kafi.javaspring.chapter_1_ioc.lesson_14_config_with_annotations;

import org.springframework.stereotype.Component;

@Component("catBean")
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
