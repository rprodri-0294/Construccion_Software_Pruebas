package com.tdea.bank.repository;

import org.springframework.stereotype.Repository;
import com.tdea.bank.model.Account;
import com.tdea.bank.repository.port.AccountRepositoryPort;

@Repository
public class AccountRepository implements AccountRepositoryPort {

    @Override
    public Account findById(Long id) {
        System.out.println("Simulando búsqueda en BD: " + id);
        return new Account(); // simulación
    }

    @Override
    public void save(Account account) {
        System.out.println("Simulando guardado en BD");
    }
}
