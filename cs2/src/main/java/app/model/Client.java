package app.model;

import java.time.LocalDate;

public class Client {

    private Long id; // Este lo usa el sistema, no el banco ni el usuario. Sirve para Identificar el
                     // registro en la base de datos, crear relaciones entre tablas y optimizar
                     // consultas.
    private String fullName;
    private String identificationNumber;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String address;
    private String role;

    public Client() {
    }

    public Client(Long id, String fullName, String identificationNumber, String email,
            String phone, LocalDate birthDate, String address, String role) {
        this.id = id;
        this.fullName = fullName;
        this.identificationNumber = identificationNumber;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.address = address;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
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

    public String getAddress() {
        return address;
    }

    public String getRole() {
        return role;
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

    public void setAddress(String address) {
        this.address = address;
    }
}