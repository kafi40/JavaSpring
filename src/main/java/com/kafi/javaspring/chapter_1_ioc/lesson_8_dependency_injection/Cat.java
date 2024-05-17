package com.kafi.javaspring.chapter_1_ioc.lesson_8_dependency_injection;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
