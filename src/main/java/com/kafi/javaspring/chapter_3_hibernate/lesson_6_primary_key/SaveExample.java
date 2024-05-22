package com.kafi.javaspring.chapter_3_hibernate.lesson_6_primary_key;

import com.kafi.javaspring.chapter_3_hibernate.lesson_6_primary_key.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee1 = new Employee("Elena", "Petrova", "Sales", 800);
            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
