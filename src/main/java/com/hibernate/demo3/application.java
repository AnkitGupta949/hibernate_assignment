package com.hibernate.demo3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class application {
    public static void main(String[] args) {
        Author author1=new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);
      Calendar calendar= Calendar.getInstance();
      calendar.set(1992,8,26);
        author1.setDob(calendar.getTime());



        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

//        session.save(author1);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
