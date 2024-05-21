package com.kafi.javaspring.chapter_2_aop.lesson_12_around;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу в UniversityLibrary");
        return "Война и мир";
    }

}
