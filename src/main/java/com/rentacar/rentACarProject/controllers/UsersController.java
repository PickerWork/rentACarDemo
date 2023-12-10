package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.entities.User;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.UserRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddRentalRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UsersController {
    private final UserRepository userRepository;
    @GetMapping("{id}")
    public User getById(@PathVariable int id){
        return this.userRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddRentalRequest request){
        this.userRepository.findAll();
    }
}
