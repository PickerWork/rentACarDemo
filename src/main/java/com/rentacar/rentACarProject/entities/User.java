package com.rentacar.rentACarProject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "gsm")
    private String gsm;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "customer")
    @JsonIgnore

    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee")
    @JsonIgnore
    private Employee employee;

}
