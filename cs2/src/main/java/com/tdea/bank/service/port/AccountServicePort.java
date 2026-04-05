
package com.tdea.bank.service.port;

import java.math.BigDecimal;
import com.tdea.bank.model.Account;

public interface AccountServicePort {

    void deposit(Long accountId, BigDecimal amount);

    void withdraw(Long accountId, BigDecimal amount);

    Account findById(Long id);
}
