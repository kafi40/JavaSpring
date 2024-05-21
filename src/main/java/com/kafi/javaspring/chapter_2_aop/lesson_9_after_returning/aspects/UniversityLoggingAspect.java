package com.kafi.javaspring.chapter_2_aop.lesson_9_after_returning.aspects;

import com.kafi.javaspring.chapter_2_aop.lesson_9_after_returning.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents" );
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents" );
        Student firstStudent = students.getFirst();
        String fullName = firstStudent.getFullName();
        fullName = "Mr. " + fullName;
        firstStudent.setFullName(fullName);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade += 1;
        firstStudent.setAvgGrade(avgGrade);
    }
}
