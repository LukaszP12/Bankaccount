package com.bankaccount.demo.repository;

import com.bankaccount.demo.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {


}
