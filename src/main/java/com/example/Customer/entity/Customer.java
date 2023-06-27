package com.example.Customer.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private int age;
    @Column
    private String dob;
    @Column
    private long phoneno;
    @Column
    private String state;
    @Column
    private String district;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Customer(int customerid, String firstname, String lastname, int age, String dob, long phoneno, String state, String district) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dob = dob;
        this.phoneno = phoneno;
        this.state = state;
        this.district = district;
    }

    public Customer() {
    }
}
