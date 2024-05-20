package com.kafi.javaspring.chapter_1_ioc.lesson_12_bean_scope;

public class Cat implements Pet {
    private String name;
    public Cat() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
