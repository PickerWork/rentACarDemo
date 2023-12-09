package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Rental;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.RentalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/rentals")
public class RentalsController {
    private final RentalRepository rentalRepository;
    public RentalsController(RentalRepository rentalRepository){
        this.rentalRepository = rentalRepository;
    }
    @GetMapping
    public List<Rental> getAll(){
        return rentalRepository.findAll();
    }
    @GetMapping("{id}")
    public Rental getById(@PathVariable int id) {
        return rentalRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Rental rental){
        rentalRepository.save(rental);
    }
    @PutMapping
    public void update(@RequestBody Rental rental){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        rentalRepository.deleteById(id);
    }
}
