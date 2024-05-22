package com.kafi.javaspring.chapter_3_hibernate.lesson_12_one_to_one;

import com.kafi.javaspring.chapter_3_hibernate.lesson_12_one_to_one.entity.Detail;
import com.kafi.javaspring.chapter_3_hibernate.lesson_12_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            Employee employee1 = new Employee("Filipp", "Kalinichev", "IT", 500);
            Detail detail = new Detail("Obninsk", "8-999-999-99-99", "test@mail.ru");
            employee1.setDetail(detail);

            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
