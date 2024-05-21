package com.kafi.javaspring.chapter_2_aop.lesson_8_join_point;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean(UniversityLibrary.class);
        Book book = context.getBean(Book.class);
        universityLibrary.getBook();
        universityLibrary.addBook("Filipp", book);
        universityLibrary.addMagazine();

        context.close();
    }
}
