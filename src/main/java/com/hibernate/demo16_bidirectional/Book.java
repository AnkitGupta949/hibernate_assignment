package com.hibernate.demo16_bidirectional;

import javax.persistence.*;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int bookId;
   private String bookName;

   @ManyToOne
   private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
