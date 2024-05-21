package com.kafi.javaspring.chapter_2_aop.lesson_7_aspects.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}

}
