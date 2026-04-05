
package com.tdea.bank.model;

import java.time.LocalDate;

import com.tdea.bank.model.enums.AccountStatus;
import com.tdea.bank.model.enums.AccountType;
import com.tdea.bank.model.enums.Currency;

public class Account {

    private Long id;
    private String accountNumber;
    private AccountType accountType;
    private double balance;
    private AccountStatus status;
    private LocalDate creationDate;

    private Customer customer;
    private Currency currency;

    public Account() {
    }

    public Account(Long id, String accountNumber, AccountType accountType,
            double balance, AccountStatus status, LocalDate creationDate,
            Customer customer, Currency currency) {

        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.creationDate = creationDate;
        this.customer = customer;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    // =========================
    // MÉTODOS DE NEGOCIO
    // =========================

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que 0");
        }

        if (this.status != AccountStatus.ACTIVE) {
            throw new IllegalStateException("La cuenta no está activa");
        }

        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que 0");
        }

        if (this.status != AccountStatus.ACTIVE) {
            throw new IllegalStateException("La cuenta no está activa");
        }

        if (this.balance < amount) {
            throw new IllegalStateException("Saldo insuficiente");
        }

        this.balance = this.balance - amount;
    }

    public void block() {
        if (this.status == AccountStatus.BLOCKED) {
            throw new IllegalStateException("La cuenta ya está bloqueada");
        }
        this.status = AccountStatus.BLOCKED;
    }

    public void activate() {
        if (this.status == AccountStatus.ACTIVE) {
            throw new IllegalStateException("La cuenta ya está activa");
        }
        this.status = AccountStatus.ACTIVE;
    }
}
