package com.example.Jba.models.embedded;

import java.time.LocalDateTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "orders")
@Entity
public class Order {   

    @EmbeddedId
    private OrderId orderId;

    private String orderinfo;
    private String anotherField;
    @Embedded
    private Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Order() {
    }

    public Order(String orderinfo, String anotherField, Address address) {
        this.orderId = new OrderId("username", LocalDateTime.now());
        this.orderinfo = orderinfo;
        this.anotherField = anotherField;
    }

    public String getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(String orderinfo) {
        this.orderinfo = orderinfo;
    }

    public String getAnotherField() {
        return anotherField;
    }

    public void setAnotherField(String anotherField) {
        this.anotherField = anotherField;
    }
}
