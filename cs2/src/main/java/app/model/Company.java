package app.model;

public class Company {

    private Long id;
    private String companyName;
    private String nit;
    private String email;
    private String phone;
    private String address;
    private String legalRepresentative;

    public Company() {
    }

    public Company(Long id, String companyName, String nit, String email,
            String phone, String address, String legalRepresentative) {
        this.id = id;
        this.companyName = companyName;
        this.nit = nit;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.legalRepresentative = legalRepresentative;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getNit() {
        return nit;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }
}
