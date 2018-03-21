package com.hibernate.demo6;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;

public class Application {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Author author1 = new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);

        calendar.set(1992, 8, 26);
        author1.setDob(calendar.getTime());

        Author author2=new Author();
        author2.setFirstName("Arpit");
        author2.setLastName("Gupta");
        author2.setAge(40);

        calendar.set(1994,07,24);
        author2.setDob(calendar.getTime());


        Author author3=new Author();
        author3.setFirstName("Vikesh");
        author3.setLastName("Kumar");
        author3.setAge(28);

        calendar.set(1998,07,28);
        author3.setDob(calendar.getTime());


        Author author4=new Author();
        author4.setFirstName("Kapil");
        author4.setLastName("Ahlawat");
        author4.setAge(24);

        calendar.set(1995,05,24);
        author4.setDob(calendar.getTime());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

         session.save(author1);
         session.save(author2);
         session.save(author3);
         session.save(author4);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
