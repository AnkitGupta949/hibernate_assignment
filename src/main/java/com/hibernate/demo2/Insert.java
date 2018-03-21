package com.hibernate.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
    public static void main(String[] args) {
        Author author1=new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);



        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

            session.save(author1);


            session.getTransaction().commit();
            session.close();
            sessionFactory.close();

    }
}
