package com.kafi.javaspring.chapter_2_aop.lesson_2_before;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("Мы берем книгу");
    }
}
