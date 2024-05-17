package com.kafi.javaspring.chapter_1_ioc.lesson_6_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIExample {
    public static void main(String[] args) {
        Pet pet1 = new Dog();
        Person person1 = new Person(pet1);
        person1.callYourPet();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_6_dependency_injection/applicationContext.xml");

        Pet pet2 = context.getBean("myPet", Pet.class);
        Person person2 = new Person(pet2);
        person2.callYourPet();
        context.close();
    }
}
