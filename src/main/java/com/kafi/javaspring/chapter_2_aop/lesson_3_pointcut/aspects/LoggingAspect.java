package com.kafi.javaspring.chapter_2_aop.lesson_3_pointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public void com.kafi.javaspring.chapter_2_aop.lesson_3_pointcut.UniversityLibrary.getBook())")
    public void beforeGetBookAdviceForUniversity() {
        System.out.println("beforeGetBookAdviceForUniversity: попытка получить книгу");
    }

    @Before("execution(public void get*())")
    public void beforeForAllGet() {
        System.out.println("beforeForAllGet: попытка получить что-то");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
}
