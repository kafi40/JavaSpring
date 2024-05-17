package com.kafi.javaspring.chapter_1_ioc.lesson_6_dependency_injection;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
