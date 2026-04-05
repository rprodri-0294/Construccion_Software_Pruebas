
package com.tdea.bank.model;

import java.time.LocalDateTime;

import com.tdea.bank.model.enums.OperationType;

public class OperationLog {

    // Bitácora del sistema para auditoría

    private Long id;
    private String action;
    private String description;
    private LocalDateTime timestamp;
    private OperationType operationType;

    private String entityName;
    private String entityId;

    private User user;

    public OperationLog() {
    }

    public OperationLog(Long id, String action, String description,
            LocalDateTime timestamp, OperationType operationType,
            String entityName, String entityId, User user) {

        this.id = id;
        this.action = action;
        this.description = description;
        this.timestamp = timestamp;
        this.operationType = operationType;
        this.entityName = entityName;
        this.entityId = entityId;
        this.user = user;
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

    public OperationType getOperationType() {
        return operationType;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getEntityId() {
        return entityId;
    }

    public User getUser() {
        return user;
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

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
