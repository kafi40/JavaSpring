package com.kafi.javaspring.chapter_2_aop.lesson_2_before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeforeExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
