
package com.tdea.bank.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.tdea.bank.model.enums.LoanStatus;
import com.tdea.bank.model.enums.UserRole;

public class Loan {

    private Long id;
    private String loanNumber;
    private BigDecimal amount;
    private BigDecimal interestRate;
    private int termMonths;
    private LoanStatus status;
    private LocalDate requestDate;

    private Client client;
    private Company company;

    public Loan() {
    }

    public Loan(Long id, String loanNumber, BigDecimal amount, BigDecimal interestRate,
            int termMonths, LoanStatus status, LocalDate requestDate,
            Client client, Company company) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que 0");
        }

        if (interestRate == null || interestRate.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("La tasa de interés debe ser mayor que 0");
        }

        if (termMonths <= 0) {
            throw new IllegalArgumentException("El plazo debe ser mayor que 0");
        }

        if (requestDate != null && requestDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de solicitud no puede ser futura");
        }

        this.id = id;
        this.loanNumber = loanNumber;
        this.amount = amount;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
        this.status = status;
        this.requestDate = requestDate;
        this.client = client;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public Client getClient() {
        return client;
    }

    public Company getCompany() {
        return company;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // =========================
    // MÉTODOS DE NEGOCIO
    // =========================

    public void approve(User user) {

        if (this.status != LoanStatus.IN_REVIEW) {
            throw new IllegalStateException("Solo se pueden aprobar préstamos en revisión");
        }

        if (user == null || user.getRole() != UserRole.ANALYST) {
            throw new IllegalStateException("Solo un ANALYST puede aprobar préstamos");
        }

        this.status = LoanStatus.APPROVED;
    }

    public void reject(User user) {

        if (this.status != LoanStatus.IN_REVIEW) {
            throw new IllegalStateException("Solo se pueden rechazar préstamos en revisión");
        }

        if (user == null || user.getRole() != UserRole.ANALYST) {
            throw new IllegalStateException("Solo un ANALYST puede rechazar préstamos");
        }

        this.status = LoanStatus.REJECTED;
    }

    public void disburse() {
        if (this.status != LoanStatus.APPROVED) {
            throw new IllegalStateException("Solo se pueden desembolsar préstamos aprobados");
        }
        this.status = LoanStatus.DISBURSED;
    }
}
