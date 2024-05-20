package com.kafi.javaspring.chapter_1_ioc.lesson_22_config_with_java;

public class Person {

    private Pet pet;
    private String surname;
    public int age;

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
    public Person(Pet pet) {
        this.pet = pet;
    }
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
