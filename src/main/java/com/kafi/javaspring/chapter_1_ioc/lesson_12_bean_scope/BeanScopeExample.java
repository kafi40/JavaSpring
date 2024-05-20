package com.kafi.javaspring.chapter_1_ioc.lesson_12_bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("chapter_1_ioc/lesson_12_bean_scope/applicationContext.xml");
        // Scope singletone
        Dog myDog = context.getBean("myDog", Dog.class);
        myDog.setName("Белка");
        Dog yourDog = context.getBean("myDog", Dog.class);
        yourDog.setName("Стрелка");
        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
        System.out.println("-------------------------------------------------------");
        // scope prototype
        Cat myCat = context.getBean("myCat", Cat.class);
        myCat.setName("Туча");
        Cat yourCat = context.getBean("myCat", Cat.class);
        myCat.setName("Снежинка");
        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);
        System.out.println(myCat.getName());
        System.out.println(yourCat.getName());
        context.close();
    }
}
