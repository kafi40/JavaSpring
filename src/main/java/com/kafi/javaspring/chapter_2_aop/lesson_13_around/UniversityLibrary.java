package com.kafi.javaspring.chapter_2_aop.lesson_13_around;

import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {
    public String returnBook() {
        System.out.println("Мы возвращаем книгу в UniversityLibrary");
        return "Война и мир";
    }

}
