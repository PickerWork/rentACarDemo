package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.User;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/users")
public class UsersController {
    private final UserRepository userRepository;
    public UsersController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }
    @GetMapping("{id}")
    public User getById(@PathVariable int id) {
        return userRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody User user){
        userRepository.save(user);
    }
    @PutMapping("/udpate")
    public void update(@RequestBody User user){

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        userRepository.deleteById(id);
    }
}
