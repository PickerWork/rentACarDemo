package com.rentacar.rentACarProject.repositories;

import com.rentacar.rentACarProject.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
