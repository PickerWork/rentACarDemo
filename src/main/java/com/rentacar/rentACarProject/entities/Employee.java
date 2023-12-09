package com.rentacar.rentACarProject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "salary")
    private String salary;

    @OneToMany(mappedBy = "employee")
    private List<User> users;
    @OneToMany(mappedBy = "rental")
    private List<Rental> rentals;
}
