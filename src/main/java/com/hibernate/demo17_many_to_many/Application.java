package com.hibernate.demo17_many_to_many;


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


        Author author3=new Author();
        author3.setFirstName("kapil");
        author3.setLastName("Kumar");
        author3.setAge(22);
        calendar.set(1996,07,25);
        author3.setDob(calendar.getTime());




        Book book1=new Book();
        book1.setBookName("Harry Porter");

        ArrayList<Author> aList1=new ArrayList<>();
        aList1.add(author1);
        aList1.add(author2);
        book1.setAuthorList(aList1);

        Book book2=new Book();
        book2.setBookName("Game Of Thrones");
        ArrayList<Author> aList2=new ArrayList<>();
        aList2.add(author2);
        aList2.add(author3);

        book2.setAuthorList(aList2);

        Book book3=new Book();
        book3.setBookName("R.S Aggarwal");
        ArrayList<Author> aList3=new ArrayList<>();
        aList3.add(author2);
        aList3.add(author3);
        book3.setAuthorList(aList3);



        Book book4=new Book();
        book4.setBookName("Let Us C");
        ArrayList<Author> aList4=new ArrayList<>();
        aList4.add(author1);
        aList4.add(author3);
        book4.setAuthorList(aList4);



        ArrayList<Book> bookList1=new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);


        ArrayList<Book> bookList2=new ArrayList<>();
        bookList2.add(book3);
        bookList2.add(book4);

        ArrayList<Book> bookList3=new ArrayList<>();
        bookList3.add(book1);
        bookList3.add(book4);





        author1.setBookList(bookList1);




        author2.setBookList(bookList2);

        author3.setBookList(bookList3);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


         session.save(author1);


         session.save(author2);

         session.save(author3);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
