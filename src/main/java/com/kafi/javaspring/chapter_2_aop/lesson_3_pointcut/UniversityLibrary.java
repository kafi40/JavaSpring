package com.kafi.javaspring.chapter_2_aop.lesson_3_pointcut;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniversityLibrary");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в UniversityLibrary");
        return "Книга";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniversityLibrary");
    }
}
