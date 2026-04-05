
package com.tdea.bank.controller;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

import com.tdea.bank.service.port.AccountServicePort;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountServicePort service;

    public AccountController(AccountServicePort service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String test() {
        return "Controller funcionando";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam Long id, @RequestParam BigDecimal amount) {
        service.deposit(id, amount);
        return "Depósito realizado";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam Long id, @RequestParam BigDecimal amount) {
        service.withdraw(id, amount);
        return "Retiro realizado";
    }
}
