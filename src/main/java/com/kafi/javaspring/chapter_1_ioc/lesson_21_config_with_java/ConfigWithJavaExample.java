package com.kafi.javaspring.chapter_1_ioc.lesson_21_config_with_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat1 = context.getBean("catBean", Cat.class);
        Pet cat2 = context.getBean("catBean", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (cat1 == cat2));

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
