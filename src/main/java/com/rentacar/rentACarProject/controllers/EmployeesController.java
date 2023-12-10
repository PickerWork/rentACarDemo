package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.entities.Employee;
import com.rentacar.rentACarProject.repositories.EmployeeRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddEmployeeRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeesController {
    private final EmployeeRepository employeeRepository;
    @GetMapping("{id}")
    public Employee getById(@PathVariable int id){
        return (Employee) this.employeeRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddEmployeeRequest request){
        this.employeeRepository.findAll();
    }
}
