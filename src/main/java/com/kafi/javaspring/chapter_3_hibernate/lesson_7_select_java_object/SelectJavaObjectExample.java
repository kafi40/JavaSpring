package com.kafi.javaspring.chapter_3_hibernate.lesson_7_select_java_object;

import com.kafi.javaspring.chapter_3_hibernate.lesson_7_select_java_object.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectJavaObjectExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();
            Employee employee2 = session.get(Employee.class, 2);
            session.getTransaction().commit();
            System.out.println(employee2);
        } finally {
            factory.close();
        }
    }
}
