package com.kafi.javaspring.chapter_1_ioc.lesson_14_config_with_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationsExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_14_config_with_annotations/applicationContext.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Dog myDog = context.getBean(Dog.class);
        myDog.say();

        context.close();
    }
}
