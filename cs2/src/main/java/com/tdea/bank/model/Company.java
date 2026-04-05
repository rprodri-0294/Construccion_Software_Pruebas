
package com.tdea.bank.model;

import java.util.List;

public class Company extends Customer {

    private String companyName;
    private String nit;
    private String legalRepresentative;

    private List<Account> accounts;
    private List<Loan> loans;

    public Company() {
    }

    public Company(Long id, String identificationNumber, String address,
            String companyName, String nit, String legalRepresentative) {

        super(id, identificationNumber, address);

        this.companyName = companyName;
        setNit(nit); // Usar el setter para validar
        this.legalRepresentative = legalRepresentative;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getNit() {
        return nit;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNit(String nit) {
        if (nit == null || nit.isEmpty()) {
            throw new IllegalArgumentException("NIT requerido");
        }
        this.nit = nit;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
