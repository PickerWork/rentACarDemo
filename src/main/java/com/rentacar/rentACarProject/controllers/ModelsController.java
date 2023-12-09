package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Model;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.ModelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/models")
public class ModelsController {
    private final ModelRepository modelRepository;
    public ModelsController(ModelRepository modelRepository){
        this.modelRepository = modelRepository;
    }
    @GetMapping
    public List<Model> getAll(){
        return modelRepository.findAll();
    }
    @GetMapping("{id}")
    public Model getById(@PathVariable int id) {
        return modelRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Model model){
        modelRepository.save(model);
    }
    @PutMapping
    public void update(@RequestBody Model model){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        modelRepository.deleteById(id);
    }
}
