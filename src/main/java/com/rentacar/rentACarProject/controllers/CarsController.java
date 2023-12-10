package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.repositories.CarRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarsController {
    private final CarRepository carRepository;


    @GetMapping("{id}")
    public Car getById(@PathVariable int id){
        return this.carRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddCarRequest request){
        this.carRepository.findAll();
    }
}
