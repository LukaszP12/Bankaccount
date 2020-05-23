package com.bankaccount.demo.repository;

import com.bankaccount.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {


}
