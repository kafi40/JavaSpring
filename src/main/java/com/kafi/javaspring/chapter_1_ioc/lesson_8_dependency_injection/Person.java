package com.kafi.javaspring.chapter_1_ioc.lesson_8_dependency_injection;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    // pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
