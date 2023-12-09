package com.rentacar.rentACarProject.repositories;

import com.rentacar.rentACarProject.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
