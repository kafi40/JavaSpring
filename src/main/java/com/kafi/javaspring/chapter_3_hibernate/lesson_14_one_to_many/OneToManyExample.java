package com.kafi.javaspring.chapter_3_hibernate.lesson_14_one_to_many;

import com.kafi.javaspring.chapter_3_hibernate.lesson_14_one_to_many.entity.Department;
import com.kafi.javaspring.chapter_3_hibernate.lesson_14_one_to_many.entity.Employee;
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
//            Department department1 = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Filipp", "Kalinichev", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1000);
//            department1.addEmployeeToDepartment(employee1);
//            department1.addEmployeeToDepartment(employee2);
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmployees());

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            // При каскаде может удалить всех департамент со всеми работниками
            session.delete(employee);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
