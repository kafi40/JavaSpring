package com.kafi.javaspring.chapter_1_ioc.lesson_18_qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_18_qualifier/applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
