package com.kafi.javaspring.chapter_1_ioc.lesson_13_init_destroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_13_init_destroy/applicationContext.xml");

        Dog myDog = context.getBean("myDog", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myDog", Dog.class);
        yourDog.say();

        Cat myCat = context.getBean("myCat", Cat.class);
        myCat.say();

        Cat yourCat = context.getBean("myCat", Cat.class);
        yourCat.say();

        context.close();
    }
}
