package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.entities.Rental;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.RentalRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddRentalRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/rentals")
@AllArgsConstructor
public class RentalsController {
    private final RentalRepository rentalRepository;
    @GetMapping("{id}")
    public Rental getById(@PathVariable int id){
        return this.rentalRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddRentalRequest request){
        this.rentalRepository.findAll();
    }
}
