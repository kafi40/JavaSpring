package com.kafi.javaspring.chapter_2_aop.lesson_6_pointcut;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Обломов")
    private String name;

    public String getName() {
        return name;
    }
}
