package com.kafi.javaspring.chapter_1_ioc.lesson_10_dependency_injection;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
