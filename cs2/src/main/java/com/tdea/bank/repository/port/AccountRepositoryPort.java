
package com.tdea.bank.repository.port;

import com.tdea.bank.model.Account;

public interface AccountRepositoryPort {

    Account findById(Long id);

    void save(Account account);
}
