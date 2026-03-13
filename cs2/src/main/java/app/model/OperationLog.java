package app.model;

import java.time.LocalDateTime;

import app.model.enums.OperationType;

public class OperationLog {

    // Esta clase es para registrar las acciones que ocurren en el sistema, para
    // auditoría y trazabilidad.

    private Long id;
    private String action;
    private String description;
    private LocalDateTime timestamp;
    private OperationType operationType;

    private User user;

    public OperationLog() {
    }

    public OperationLog(Long id, String action, String description,
            LocalDateTime timestamp, User user, OperationType operationType) {
        this.id = id;
        this.action = action;
        this.description = description;
        this.timestamp = timestamp;
        this.user = user;
        this.operationType = operationType;
    }

    public Long getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
