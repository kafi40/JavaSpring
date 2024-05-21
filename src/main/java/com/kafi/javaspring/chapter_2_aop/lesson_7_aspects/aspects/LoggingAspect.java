package com.kafi.javaspring.chapter_2_aop.lesson_7_aspects.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.kafi.javaspring.chapter_2_aop.lesson_7_aspects.aspects.Pointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
    }
}
