
package com.tdea.bank.model;

import com.tdea.bank.model.enums.UserRole;
import com.tdea.bank.model.enums.UserStatus;

public class User {

    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private UserRole role;
    private UserStatus status;

    private Customer customer;

    public User() {
    }

    public User(Long id, String username, String password, String fullName,
            String email, UserRole role, UserStatus status, Customer customer) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.status = status;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
