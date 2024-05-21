package com.kafi.javaspring.chapter_2_aop.lesson_5_pointcut;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу из UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniversityLibrary");
    }
}
