package com.kafi.javaspring.chapter_2_aop.lesson_6_pointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* return*())")
    private void allReturnMethods() {}

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Pointcut("allReturnMethods() || allGetMethods()")
    private void allGetAndReturnMethods() {}

    @Pointcut("execution(* *(..))")
    private void allMethodsFromUniversityLibrary() {}

    @Pointcut("execution(* returnMagazine())")
    private void returnMagazineMethod() {}

    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineMethod()")
    private void allMethodsExceptReturnMagazine(){}


    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethods()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethods()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }

    @Before("allMethodsExceptReturnMagazine()")
    public void beforeAllMethodsExceptReturnMagazine() {
        System.out.println("beforeAllMethodsExceptReturnMagazine: writing Log #4");
    }
}
