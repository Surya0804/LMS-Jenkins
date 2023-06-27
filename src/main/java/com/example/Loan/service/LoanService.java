package com.example.Loan.service;

import com.example.Loan.entity.Loan;
import com.example.Loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;
    //add loan
    public ResponseEntity<Loan> addLoan(Loan loan)
    {
        return ResponseEntity.ok(loanRepository.save(loan));
    }

    //get all loan details
    public ResponseEntity<List<Loan>> getAllLoans()
    {
        return ResponseEntity.ok(loanRepository.findAll());
    }
    //delete loan by id
    public ResponseEntity<String> deleteLoanById(int id)
    {
        loanRepository.deleteById(id);
        return ResponseEntity.ok().body("Deleted successfully");
    }
    //update loan
    public ResponseEntity<Loan> updateLoan(Loan loan,int id)
    {
        Loan loan1=loanRepository.findById(id).get();
       loan1.setCustomerid(loan.getCustomerid());
       loan1.setAadhar(loan.getAadhar());
       loan1.setLoanamount(loan.getLoanamount());
       loan1.setLoanname(loan.getLoanname());
       loan1.setOccupation(loan.getOccupation());
       loan1.setPancard(loan.getPancard());
       loan1.setSalary(loan.getSalary());
       loan1.setLoanid(loan.getLoanid());
       return ResponseEntity.ok(loanRepository.save(loan1));
    }
    //get loan by id
    public ResponseEntity<Loan> getLoanById(int id)
    {
        return ResponseEntity.ok(loanRepository.findById(id).get());
    }
}
