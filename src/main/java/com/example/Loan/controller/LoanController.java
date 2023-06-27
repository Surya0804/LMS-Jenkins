package com.example.Loan.controller;

import com.example.Loan.entity.Loan;
import com.example.Loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
@CrossOrigin(origins = "http://localhost:4200/")
public class LoanController {
    @Autowired
    private LoanService loanService;
    @PostMapping("/addloan")
    public ResponseEntity<Loan> addLoan(@RequestBody Loan loan)
    {
        return loanService.addLoan(loan);
    }
    @GetMapping("/getallloans")
    public ResponseEntity<List<Loan>> getAllLoans()
    {
        return loanService.getAllLoans();
    }
    @DeleteMapping("/deleteloan/{id}")
    public ResponseEntity<String> deleteLoanById(@PathVariable int id)
    {
        return loanService.deleteLoanById(id);
    }
    @PutMapping("/updateloan/{id}")
    public ResponseEntity<Loan> updateLoan(@RequestBody Loan loan,@PathVariable int id)
    {
        return loanService.updateLoan(loan,id);
    }
    @GetMapping("/getloanbyid/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable int id)
    {
        return loanService.getLoanById(id);
    }
}
