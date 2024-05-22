package com.kafi.javaspring.chapter_3_hibernate.lesson_15_one_to_many;

import com.kafi.javaspring.chapter_3_hibernate.lesson_15_one_to_many.entity.Department;
import com.kafi.javaspring.chapter_3_hibernate.lesson_15_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Department department1 = new Department("HR", 500, 1500);
            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
            Employee employee2 = new Employee("Andrey", "Sidorov", 1000);
            department1.addEmployeeToDepartment(employee1);
            department1.addEmployeeToDepartment(employee2);
            session.beginTransaction();
            session.save(department1);

            System.out.println(department1);
            System.out.println(department1.getEmployees());
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
