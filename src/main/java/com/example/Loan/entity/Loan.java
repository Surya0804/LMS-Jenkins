package com.example.Loan.entity;

import javax.persistence.*;

@Entity
@Table(name = "loan_table")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loanid;
    @Column
    private String loanname;
    @Column
    private int loanamount;
    @Column
    private int aadhar;
    @Column
    private String pancard;
    @Column
    private String occupation;
    @Column
    private int salary;
    @Column(name = "customerid")
    private int customerid;

    public int getLoanid() {
        return loanid;
    }

    public void setLoanid(int loanid) {
        this.loanid = loanid;
    }

    public String getLoanname() {
        return loanname;
    }

    public void setLoanname(String loanname) {
        this.loanname = loanname;
    }

    public int getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(int loanamount) {
        this.loanamount = loanamount;
    }

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Loan(int loanid, String loanname, int loanamount, int aadhar, String pancard, String occupation, int salary, int customerid) {
        this.loanid = loanid;
        this.loanname = loanname;
        this.loanamount = loanamount;
        this.aadhar = aadhar;
        this.pancard = pancard;
        this.occupation = occupation;
        this.salary = salary;
        this.customerid = customerid;
    }

    public Loan() {
    }
}
