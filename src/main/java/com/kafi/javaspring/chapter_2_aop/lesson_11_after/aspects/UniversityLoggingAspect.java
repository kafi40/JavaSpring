package com.kafi.javaspring.chapter_2_aop.lesson_11_after.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем нормальное окончание работы метода или выброс исключения");
    }
}
