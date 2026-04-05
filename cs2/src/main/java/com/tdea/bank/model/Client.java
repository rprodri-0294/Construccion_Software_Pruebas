
package com.tdea.bank.model;

import java.time.LocalDate;
import java.util.List;

import com.tdea.bank.model.enums.ClientRole;

public class Client extends Customer {

    private String fullName;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private ClientRole role;

    private List<Account> accounts;
    private List<Loan> loans;

    public Client() {
    }

    public Client(Long id, String identificationNumber, String address,
            String fullName, String email, String phone,
            LocalDate birthDate, ClientRole role) {

        super(id, identificationNumber, address);

        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public ClientRole getRole() {
        return role;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setRole(ClientRole role) {
        this.role = role;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
