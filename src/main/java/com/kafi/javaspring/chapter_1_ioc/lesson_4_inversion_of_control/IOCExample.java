package com.kafi.javaspring.chapter_1_ioc.lesson_4_inversion_of_control;

public class IOCExample {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();

        pet = new Cat();
        pet.say();
    }
}
