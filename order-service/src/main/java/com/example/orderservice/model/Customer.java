package com.example.orderservice.model;


import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String nom;
    private String email;
}
