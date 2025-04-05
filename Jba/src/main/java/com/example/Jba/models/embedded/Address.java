package com.example.Jba.models.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String city;
    private String housNumber;

    public Address() {
    }

    public Address(String street, String city, String housNumber) {
        this.street = street;
        this.city = city;
        this.housNumber = housNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getHousNumber() {
        return housNumber;
    }
    public void setHousNumber(String housNumber) {
        this.housNumber = housNumber;
    }
    
}
