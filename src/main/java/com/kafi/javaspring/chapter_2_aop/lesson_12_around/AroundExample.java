package com.kafi.javaspring.chapter_2_aop.lesson_12_around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundExample {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean(UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
