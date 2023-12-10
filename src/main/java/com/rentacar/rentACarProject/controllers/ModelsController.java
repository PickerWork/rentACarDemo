package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.entities.Model;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.ModelRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/models")
@AllArgsConstructor
public class ModelsController {
    private final ModelRepository modelRepository;
    @GetMapping("{id}")
    public Model getById(@PathVariable int id){
        return this.modelRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddCarRequest request){
        this.modelRepository.findAll();
    }
}
