package app.model;

import java.time.LocalDate;
import java.math.BigDecimal;

import app.model.enums.AccountStatus;
import app.model.enums.AccountType;
import app.model.enums.Currency;

public class Account {

    private Long id; // Un identificador técnico accountNumber del negocio.
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance;
    private AccountStatus status;
    private LocalDate creationDate;

    private Client client;
    private Company company;
    private Currency currency;

    public Account() {
    }

    public Account(Long id, String accountNumber, AccountType accountType,
            BigDecimal balance, AccountStatus status, LocalDate creationDate,
            Client client, Company company, Currency currency) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.creationDate = creationDate;
        this.client = client;
        this.company = company;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Client getClient() {
        return client;
    }

    public Company getCompany() {
        return company;
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

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
