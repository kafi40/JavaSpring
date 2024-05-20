package com.kafi.javaspring.chapter_1_ioc.lesson_19_value;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueExample {
        public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_19_value/applicationContext.xml");

        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
