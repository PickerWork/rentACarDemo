package com.rentacar.rentACarProject.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "mode_year")
    private int modelYear;
    @Column(name = "fuel_type")
    private String fuelType;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @OneToMany(mappedBy = "payment")
    private List<Payment> payments;


}
