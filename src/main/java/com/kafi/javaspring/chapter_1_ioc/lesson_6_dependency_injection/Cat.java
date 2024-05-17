package com.kafi.javaspring.chapter_1_ioc.lesson_6_dependency_injection;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
