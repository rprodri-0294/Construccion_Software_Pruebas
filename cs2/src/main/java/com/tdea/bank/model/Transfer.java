
package com.tdea.bank.model;

import java.time.LocalDateTime;
import java.math.BigDecimal;

import com.tdea.bank.model.enums.TransferStatus;

public class Transfer {

    private Long id;
    private BigDecimal amount;
    private LocalDateTime transferDate;
    private TransferStatus status;

    private Account sourceAccount;
    private Account destinationAccount;

    private User createdBy;
    private User approvedBy;

    public Transfer() {
    }

    public Transfer(Long id, BigDecimal amount, LocalDateTime transferDate,
            TransferStatus status, Account sourceAccount, Account destinationAccount,
            User createdBy, User approvedBy) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que 0");
        }

        if (sourceAccount == null || destinationAccount == null) {
            throw new IllegalArgumentException("Las cuentas no pueden ser nulas");
        }

        if (sourceAccount.equals(destinationAccount)) {
            throw new IllegalArgumentException("Las cuentas no pueden ser iguales");
        }

        this.id = id;
        this.amount = amount;
        this.transferDate = transferDate;
        this.status = status;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.createdBy = createdBy;
        this.approvedBy = approvedBy;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
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

    public User getCreatedBy() {
        return createdBy;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setAmount(BigDecimal amount) {
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

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    // =========================
    // MÉTODOS DE NEGOCIO
    // =========================

    public void approve(User approver) {
        if (this.status != TransferStatus.PENDING) {
            throw new IllegalStateException("Solo se pueden aprobar transferencias pendientes");
        }

        this.approvedBy = approver;
        this.status = TransferStatus.COMPLETED;
    }

    public void execute() {
        if (this.status != TransferStatus.PENDING) {
            throw new IllegalStateException("La transferencia no está pendiente");
        }

        double amountValue = this.amount.doubleValue();

        // Ejecuta la transferencia
        sourceAccount.withdraw(amountValue);
        destinationAccount.deposit(amountValue);

        this.status = TransferStatus.COMPLETED;
        this.transferDate = LocalDateTime.now();
    }
}
