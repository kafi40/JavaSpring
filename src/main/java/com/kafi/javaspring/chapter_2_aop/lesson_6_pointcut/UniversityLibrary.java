package com.kafi.javaspring.chapter_2_aop.lesson_6_pointcut;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу из UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniversityLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniversityLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniversityLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniversityLibrary");
    }
}
