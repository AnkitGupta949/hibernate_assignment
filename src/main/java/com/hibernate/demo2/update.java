package com.hibernate.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class update {

    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();



        Author author=session.get(Author.class,1);
        author.setFirstName("arpit");
        author.setAge(26);
        session.update(author);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
