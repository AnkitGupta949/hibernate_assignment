package com.hibernate.demo16_bidirectional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Calendar;

public class Application {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();


        Author author1 = new Author();
        author1.setFirstName("Ankit");
        author1.setLastName("Gupta");
        author1.setAge(25);
        author1.setDob(calendar.getTime());
        calendar.set(1992, 8, 26);





        Author author2=new Author();
        author2.setFirstName("Vikesh");
        author2.setLastName("Kumar");
        author2.setAge(28);
        calendar.set(1998,07,28);
        author2.setDob(calendar.getTime());





        Book book1=new Book();
        book1.setBookName("Harry Porter");
        book1.setAuthor(author1);

        Book book2=new Book();
        book2.setBookName("Game Of Thrones");
        book2.setAuthor(author1);

        Book book3=new Book();
        book3.setBookName("R.S Aggarwal");
        book3.setAuthor(author2);


        Book book4=new Book();
        book4.setBookName("Let Us C");
        book4.setAuthor(author2);


        ArrayList<Book> bookList1=new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);


        ArrayList<Book> bookList2=new ArrayList<>();
        bookList2.add(book3);
        bookList2.add(book4);




        author1.setBookList(bookList1);
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
