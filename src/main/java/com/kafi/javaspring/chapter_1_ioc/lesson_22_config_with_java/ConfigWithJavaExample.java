package com.kafi.javaspring.chapter_1_ioc.lesson_22_config_with_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
