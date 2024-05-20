package com.kafi.javaspring.chapter_1_ioc.lesson_16_autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_16_autowired/applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
