package com.kafi.javaspring.chapter_1_ioc.lesson_23_property_source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
