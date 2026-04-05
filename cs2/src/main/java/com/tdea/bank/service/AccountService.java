package com.tdea.bank.service;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

import com.tdea.bank.model.Account;
import com.tdea.bank.repository.port.AccountRepositoryPort;
import com.tdea.bank.service.port.AccountServicePort;

@Service
public class AccountService implements AccountServicePort {

    private final AccountRepositoryPort repository;

    public AccountService(AccountRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(Long accountId, BigDecimal amount) {
        Account account = repository.findById(accountId);

        if (account == null) {
            throw new IllegalArgumentException("Cuenta no encontrada");
        }

        // Convertimos BigDecimal a double para que Account acepte el monto
        account.deposit(amount.doubleValue());
        repository.save(account);
    }

    @Override
    public void withdraw(Long accountId, BigDecimal amount) {
        Account account = repository.findById(accountId);

        if (account == null) {
            throw new IllegalArgumentException("Cuenta no encontrada");
        }

        // Convertimos BigDecimal a double
        account.withdraw(amount.doubleValue());
        repository.save(account);
    }

    @Override
    public Account findById(Long id) {
        return repository.findById(id);
    }
}