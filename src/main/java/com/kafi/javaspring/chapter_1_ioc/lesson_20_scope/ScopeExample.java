package com.kafi.javaspring.chapter_1_ioc.lesson_20_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_20_scope/applicationContext.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog yourDog = context.getBean("dogBean", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println("----------------------------------------------------");

        Cat myCat = context.getBean("catBean", Cat.class);
        Cat yourCat = context.getBean("catBean", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();

    }
}
