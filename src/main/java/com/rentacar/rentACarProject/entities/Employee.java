package com.rentacar.rentACarProject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "salary")
    private String salary;
    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<User> users;
    @OneToMany(mappedBy = "rental")
    @JsonIgnore
    private List<Rental> rentals;
}
