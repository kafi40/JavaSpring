package com.kafi.javaspring.chapter_2_aop.lesson_10_after_throwing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean(University.class);
        university.addStudents();

        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }

        context.close();
    }
}
