package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Employee;
import com.rentacar.rentACarProject.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/employees")
public class EmployeesController {
    private final EmployeeRepository employeeRepository;
    public EmployeesController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @GetMapping
    public List<EmployeeRepository> getAll(){
        return employeeRepository.findAll();
    }
    @GetMapping("{id}")
    public EmployeeRepository getById(@PathVariable int id) {
        return employeeRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Employee employee){
        //employeeRepository.save(employee);
    }
    @PutMapping
    public void update(@RequestBody Employee employee){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        employeeRepository.deleteById(id);
    }
}
