package com.kafi.javaspring.chapter_3_hibernate.lesson_13_one_to_one;

import com.kafi.javaspring.chapter_3_hibernate.lesson_13_one_to_one.entity.Detail;
import com.kafi.javaspring.chapter_3_hibernate.lesson_13_one_to_one.entity.Employee;
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
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Employee employee1 = new Employee("Mihail", "Sidorov", "HR", 850);
            Detail detail1 = new Detail("London", "8-999-999-99-99", "test@mail.ru");
            employee1.setDetail(detail1);
            detail1.setEmployee(employee1);


            session.beginTransaction();
            session.save(detail1);
            Detail detail2 = session.get(Detail.class, 2);
            System.out.println(detail2);

            detail2.getEmployee().setDetail(null);
            session.delete(detail2);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
