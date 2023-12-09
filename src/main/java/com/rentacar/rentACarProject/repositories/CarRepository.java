package com.rentacar.rentACarProject.repositories;

import com.rentacar.rentACarProject.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
