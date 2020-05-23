package com.bankaccount.demo.controller;

import com.bankaccount.demo.model.Account;
import com.bankaccount.demo.repository.AccountRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepo accountRepo;

    @PostMapping
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountRepo.save(account);
    }

    @GetMapping
    public List<Account> getAccounts(){
        return accountRepo.findAll();
    }




}
