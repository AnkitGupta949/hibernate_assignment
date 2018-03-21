package com.hibernate.demo9;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {


        @Id @GeneratedValue(strategy = GenerationType.TABLE)


        private int id;

        @Column(name = "fname")
        private String firstName;

        @Transient
        @Column(name = "lname")
        private String lastName;

        @Column(name = "age")
        int age;

        @Temporal(TemporalType.DATE) //@Temporal(TemporalType.DATE)-:it will appear as only date not with time
        @Column(name = "DateofBirth")
        Date dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }


