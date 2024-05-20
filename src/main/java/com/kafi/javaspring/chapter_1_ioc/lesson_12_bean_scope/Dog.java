package com.kafi.javaspring.chapter_1_ioc.lesson_12_bean_scope;

public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
