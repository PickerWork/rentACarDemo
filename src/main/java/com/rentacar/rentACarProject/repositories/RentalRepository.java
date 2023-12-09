package com.rentacar.rentACarProject.repositories;

import com.rentacar.rentACarProject.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental,Integer> {
}
