package com.kafi.javaspring.chapter_3_hibernate.lesson_9_delete_java_object;

import com.kafi.javaspring.chapter_3_hibernate.lesson_9_delete_java_object.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteJavaObjectExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee1 = session.get(Employee.class, 1);
            employee1.setSalary(1500);
            System.out.println(employee1);


            session.createQuery("update Employee set salary = 1000 where name = 'Filipp'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
