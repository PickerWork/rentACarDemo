package com.rentacar.rentACarProject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<User> users;
    @OneToMany(mappedBy = "rental")
    private List<Rental> rentals;
}
