package com.kafi.javaspring.chapter_2_aop.lesson_4_pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean(UniversityLibrary.class);
        universityLibrary.getBook("Преступление и наказание");
        universityLibrary.getMagazine(18);

        Book book = context.getBean(Book.class);
        universityLibrary.getBook(book);


        context.close();
    }
}
