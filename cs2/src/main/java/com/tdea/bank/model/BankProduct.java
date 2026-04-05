
package com.tdea.bank.model;

import com.tdea.bank.model.enums.ProductType;

public class BankProduct {

    private Long id;
    private String name;
    private String description;
    private ProductType productType;
    private boolean active;

    public BankProduct() {
    }

    public BankProduct(Long id, String name, String description,
            ProductType productType, boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productType = productType;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
