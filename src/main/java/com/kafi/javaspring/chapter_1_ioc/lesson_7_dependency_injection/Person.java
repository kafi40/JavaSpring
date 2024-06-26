package com.kafi.javaspring.chapter_1_ioc.lesson_7_dependency_injection;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
