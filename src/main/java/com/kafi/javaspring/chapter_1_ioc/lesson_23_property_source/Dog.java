package com.kafi.javaspring.chapter_1_ioc.lesson_23_property_source;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
