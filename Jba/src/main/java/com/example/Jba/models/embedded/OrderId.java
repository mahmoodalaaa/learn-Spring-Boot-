package com.example.Jba.models.embedded;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable {

    private String username;

    private LocalDateTime orderDateTime;

    public OrderId() {
    }

    public OrderId(String username, LocalDateTime orderDateTime) {
        this.username = username;
        this.orderDateTime = orderDateTime;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }


}
