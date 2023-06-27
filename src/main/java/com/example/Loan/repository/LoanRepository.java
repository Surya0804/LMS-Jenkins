package com.example.Loan.repository;

import com.example.Loan.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Integer> {

}
