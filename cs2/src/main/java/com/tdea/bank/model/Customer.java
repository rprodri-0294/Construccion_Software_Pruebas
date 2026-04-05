
package com.tdea.bank.model;

public class Customer {

    protected Long id;
    protected String identificationNumber;
    protected String address;

    public Customer() {
    }

    public Customer(Long id, String identificationNumber, String address) {
        this.id = id;
        this.identificationNumber = identificationNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
