package com.hibernate.demo14;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*Calendar calendar = Calendar.getInstance();



        Author author1 = new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);

        calendar.set(1992, 8, 26);
        author1.setDob(calendar.getTime());






        Author author2=new Author();
        author2.setFirstName("Vikesh");
        author2.setLastName("Kumar");
        author2.setAge(28);

        calendar.set(1998,07,28);
        author2.setDob(calendar.getTime());
*/
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//         session.save(author1);
//
//         session.save(author2);



        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
