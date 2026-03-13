package app.model;

import java.time.LocalDate;

import app.model.enums.LoanStatus;

public class Loan {

    // Un préstamo es un dinero que el banco entrega a un cliente o empresa y que
    // luego debe ser pagado. Puede pertenecer a: Client (persona natural) / Company
    // (empresa).

    private Long id;
    private String loanNumber;
    private double amount;
    private double interestRate;
    private int termMonths;
    private LoanStatus status;
    private LocalDate requestDate;

    private Client client;
    private Company company;

    public Loan() {
    }

    public Loan(Long id, String loanNumber, double amount, double interestRate,
            int termMonths, LoanStatus status, LocalDate requestDate,
            Client client, Company company) {
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

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
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

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
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
}
