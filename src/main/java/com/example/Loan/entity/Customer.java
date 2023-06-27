package com.example.Loan.entity;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerid;
    private String firstname;
    private String lastname;
    private int age;
    private String dob;
    private long phoneno;
    private String state;
    private String district;
    private boolean isactive;
    private List<Loan> loans=new ArrayList<>();
}
