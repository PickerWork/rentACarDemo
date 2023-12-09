package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
    private final BrandRepository brandRepository;
    public BrandsController(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }
    @GetMapping
    public List<Brand> getAll(){
        return brandRepository.findAll();
    }
    @GetMapping("{id}")
    public Brand getById(@PathVariable int id) {
        return brandRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Brand brand){
        brandRepository.save(brand);
    }
    @PutMapping
    public void update(@RequestBody Brand brand){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        brandRepository.deleteById(id);
    }
}
