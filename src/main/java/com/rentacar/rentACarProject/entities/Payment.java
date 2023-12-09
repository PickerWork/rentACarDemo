package com.rentacar.rentACarProject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="payment_method")
    private String paymentMethod;
    @OneToMany(mappedBy = "rental")
    private List<Rental> rentals;

}
