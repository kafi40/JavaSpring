package com.kafi.javaspring.chapter_1_ioc.lesson_4_inversion_of_control;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
