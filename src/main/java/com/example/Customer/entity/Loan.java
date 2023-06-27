package com.example.Customer.entity;

import javax.persistence.Column;

public class Loan {
    private int loanid;
    private String loanname;
    private int loanamount;
    private int aadhar;
    private String pancard;
    private String occupation;
    private int salary;
    private boolean isactive;
    private Customer customer;
}
