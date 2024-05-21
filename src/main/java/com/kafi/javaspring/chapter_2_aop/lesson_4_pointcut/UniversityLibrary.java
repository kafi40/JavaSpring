package com.kafi.javaspring.chapter_2_aop.lesson_4_pointcut;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    public void getBook(String bookName) {
        System.out.println("Мы берем книгу из UniversityLibrary " + bookName);
    }

    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniversityLibrary " + book.getName());
    }

    public void getMagazine(int a) {
        System.out.println("Мы берем журнал из UniversityLibrary");
    }
}
