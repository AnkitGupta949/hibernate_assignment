package com.hibernate.demo16_unidirectional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Calendar;

public class Application {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();




        Book book1=new Book();
        book1.setBookName("Harry Porter");

        Book book2=new Book();
        book2.setBookName("Game Of Thrones");

        Book book3=new Book();
        book3.setBookName("R.S Aggarwal");

        Book book4=new Book();
        book4.setBookName("Let Us C");

        ArrayList<Book> bookList1=new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);


        ArrayList<Book> bookList2=new ArrayList<>();
        bookList2.add(book3);
        bookList2.add(book4);



        Author author1 = new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);
        author1.setDob(calendar.getTime());
        calendar.set(1992, 8, 26);

        author1.setBookList(bookList1);



        Author author2=new Author();
        author2.setFirstName("Vikesh");
        author2.setLastName("Kumar");
        author2.setAge(28);
        calendar.set(1998,07,28);
        author2.setDob(calendar.getTime());

        author2.setBookList(bookList2);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


         session.save(author1);


         session.save(author2);



        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
