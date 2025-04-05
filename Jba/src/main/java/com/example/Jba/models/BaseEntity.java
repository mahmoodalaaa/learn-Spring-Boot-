package com.example.Jba.models;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private String createdBy;
    private String lastModifiedBy;

    
    public BaseEntity(LocalDateTime createdAt, LocalDateTime lastModifiedAt,
     String createdBy, String lastModifiedBy) {
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }

    public BaseEntity() {
      
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    

}
