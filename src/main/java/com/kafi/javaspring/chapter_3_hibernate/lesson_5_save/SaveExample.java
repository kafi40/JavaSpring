package com.kafi.javaspring.chapter_3_hibernate.lesson_5_save;

import com.kafi.javaspring.chapter_3_hibernate.lesson_5_save.entity.Employee;
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
            Employee employee1 = new Employee("Filipp", "Kalinichev", "IT", 500);
            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
