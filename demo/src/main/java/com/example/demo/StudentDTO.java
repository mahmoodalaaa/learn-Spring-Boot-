package com.example.demo;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;



public record StudentDTO(
    @NotEmpty(message = "Name cannot be empty")
    @NotNull
    String name,
    long schoolId
) {
    
}
