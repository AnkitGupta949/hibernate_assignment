package com.hibernate.demo17_many_to_many;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int bookId;
   private String bookName;

   @ManyToMany(mappedBy = "bookList")
   private List<Author> authorList;

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
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
