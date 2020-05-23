package com.bankaccount.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private String description;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private TransactionType type;


    enum TransactionType {
        EXPANSE, INCOME, TRANSFER;
    }

}
