package app.model;

import java.time.LocalDateTime;

import app.model.enums.TransferStatus;

public class Transfer {

    // Transfer representa una transferencia de dinero entre dos cuentas bancarias.
    // Conecta directamente con Account.

    private Long id;
    private double amount;
    private LocalDateTime transferDate;
    private TransferStatus status;

    private Account sourceAccount;
    private Account destinationAccount;

    public Transfer() {
    }

    public Transfer(Long id, double amount, LocalDateTime transferDate,
            TransferStatus status, Account sourceAccount, Account destinationAccount) {
        this.id = id;
        this.amount = amount;
        this.transferDate = transferDate;
        this.status = status;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public TransferStatus getStatus() {
        return status;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public void setStatus(TransferStatus status) {
        this.status = status;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
