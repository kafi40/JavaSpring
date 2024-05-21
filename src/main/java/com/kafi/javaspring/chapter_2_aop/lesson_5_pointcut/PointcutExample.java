package com.kafi.javaspring.chapter_2_aop.lesson_5_pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean(UniversityLibrary.class);
        universityLibrary.getBook();
        universityLibrary.getMagazine();

        context.close();
    }
}
