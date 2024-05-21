package com.kafi.javaspring.chapter_2_aop.lesson_4_pointcut.aspects;

import com.kafi.javaspring.chapter_2_aop.lesson_4_pointcut.Book;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook(String))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public void get*(*))")
    public void beforeGetAllAdviceWithParam() {
        System.out.println("beforeGetAllAdviceWithParam: попытка получить что-то с любым параметром");
    }

    @Before("execution(public void get*(..))")
    public void beforeGetAllAdviceWithParams() {
        System.out.println("beforeGetAllAdviceWithParams: попытка получить что-то с любым количеством любых параметров");
    }

    @Before("execution(public void getBook(com.kafi.javaspring.chapter_2_aop.lesson_4_pointcut.Book))")
    public void beforeBookAdviceWithMyClass() {
        System.out.println("beforeBookAdviceWithMyClass: попытка получить книгу с собственным классом");
    }
}
