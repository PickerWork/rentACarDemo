package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Customer;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/customers")
public class CustomersController {
    private final CustomerRepository customerRepository;
    public CustomersController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @GetMapping
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }
    @GetMapping("{id}")
    public Customer getById(@PathVariable int id) {
        return customerRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Customer customer){customerRepository.save(customer);
    }
    @PutMapping
    public void update(@RequestBody Customer customer){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        customerRepository.deleteById(id);
    }
}
