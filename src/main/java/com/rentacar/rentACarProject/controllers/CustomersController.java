package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Customer;
import com.rentacar.rentACarProject.repositories.CustomerRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
@AllArgsConstructor
public class CustomersController {
    private final CustomerRepository customerRepository;
    @GetMapping("{id}")
    public Customer getById(@PathVariable int id){
        return this.customerRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddCustomerRequest request){
        this.customerRepository.findAll();
    }
}
