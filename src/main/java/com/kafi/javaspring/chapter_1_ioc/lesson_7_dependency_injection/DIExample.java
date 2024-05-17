package com.kafi.javaspring.chapter_1_ioc.lesson_7_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_7_dependency_injection/applicationContext.xml");

        Person person1 = context.getBean("myPerson", Person.class);
        person1.callYourPet();
        context.close();
    }
}
