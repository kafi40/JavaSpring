package com.kafi.javaspring.chapter_3_hibernate.lesson_7_select_java_object;

import com.kafi.javaspring.chapter_3_hibernate.lesson_7_select_java_object.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SelectJavaObjectExample2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();


            List<Employee> employees = session.createQuery("from Employee").getResultList();

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            employees = session.createQuery("from Employee where name = 'Filipp'").getResultList();

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            employees = session.createQuery("from Employee where name = 'Filipp' and salary > 650").getResultList();

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
