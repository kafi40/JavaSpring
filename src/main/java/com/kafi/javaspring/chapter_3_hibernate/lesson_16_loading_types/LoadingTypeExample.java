package com.kafi.javaspring.chapter_3_hibernate.lesson_16_loading_types;

import com.kafi.javaspring.chapter_3_hibernate.lesson_16_loading_types.entity.Department;
import com.kafi.javaspring.chapter_3_hibernate.lesson_16_loading_types.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadingTypeExample {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
//            Department department1 = new Department("Sales", 800, 1500);
//            Employee employee1 = new Employee("Filipp", "Kalinichev", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//            Employee employee3 = new Employee("Anton", "Sidorov", 1200);
//            department1.addEmployeeToDepartment(employee1);
//            department1.addEmployeeToDepartment(employee2);
//            department1.addEmployeeToDepartment(employee3);

            session.beginTransaction();
//            session.save(department1);
            System.out.println("Get department");
            Department department1 = session.get(Department.class, 5);
            System.out.println("Show department");
            System.out.println(department1);
            System.out.println("Show employee");
            System.out.println(department1.getEmployees());
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
