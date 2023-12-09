package com.rentacar.rentACarProject.repositories;

import com.rentacar.rentACarProject.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
