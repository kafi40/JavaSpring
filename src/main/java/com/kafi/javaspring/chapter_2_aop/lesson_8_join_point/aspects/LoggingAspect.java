package com.kafi.javaspring.chapter_2_aop.lesson_8_join_point.aspects;


import com.kafi.javaspring.chapter_2_aop.lesson_8_join_point.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.kafi.javaspring.chapter_2_aop.lesson_8_join_point.aspects.Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] objects = joinPoint.getArgs();
            for (Object o : objects) {
                if (o instanceof Book book) {
                    System.out.println("Информация о книге: название - " + book.getName() + ", автор - " + book.getAuthor());
                } else if (o instanceof String s) {
                    System.out.println("Книгу в библиотеку добавляет " + s);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------------");
    }
}
