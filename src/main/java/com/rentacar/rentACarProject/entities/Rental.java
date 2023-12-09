package com.rentacar.rentACarProject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rental")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rental {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="start_date")
    private String startDate;
    @Column(name="end_date")
    private String endDate;
    @Column(name="active")
    private boolean active;
    @ManyToOne
    @JoinColumn(name="car_id")
    @JsonIgnore
    private Car car;
    @ManyToOne
    @JoinColumn(name="customer_id")
    @JsonIgnore
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "payment_id")
    @JsonIgnore
    private Payment payment;



}
