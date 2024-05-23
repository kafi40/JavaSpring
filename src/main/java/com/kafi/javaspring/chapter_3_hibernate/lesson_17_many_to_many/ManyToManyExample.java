package com.kafi.javaspring.chapter_3_hibernate.lesson_17_many_to_many;

import com.kafi.javaspring.chapter_3_hibernate.lesson_17_many_to_many.entity.Child;
import com.kafi.javaspring.chapter_3_hibernate.lesson_17_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Filipp", 7);
//            Child child2 = new Child("Zaur", 5);
//            Child child3 = new Child("Maria", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            ********************************************************************
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            ********************************************************************
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section1 = session.get(Section.class, 3);
//            System.out.println(section1);
//            System.out.println(section1.getChildren());
//
//            Child child1 = session.get(Child.class, 7);
//            System.out.println(child1);
//            System.out.println(child1.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            ********************************************************************
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section1 = session.get(Section.class, 3);
//            session.delete(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            ********************************************************************

            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Filipp", 7);
            Child child2 = new Child("Zaur", 5);
            Child child3 = new Child("Maria", 6);

            session.beginTransaction();

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.persist(section1);

            session.getTransaction().commit();
            System.out.println("Done!");
//            ********************************************************************
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
