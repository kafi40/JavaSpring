package com.kafi.javaspring.chapter_1_ioc.lesson_5_inversion_of_control;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
