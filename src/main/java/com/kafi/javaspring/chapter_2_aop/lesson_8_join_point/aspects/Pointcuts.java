package com.kafi.javaspring.chapter_2_aop.lesson_8_join_point.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}

}
