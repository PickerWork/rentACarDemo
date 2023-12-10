package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.entities.Car;
import com.rentacar.rentACarProject.entities.Model;
import com.rentacar.rentACarProject.entities.Payment;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.repositories.ModelRepository;
import com.rentacar.rentACarProject.repositories.PaymentRepository;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddCarRequest;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddPaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/payments")
@AllArgsConstructor
public class PaymentsController {
    private final PaymentRepository paymentRepository;
    @GetMapping("{id}")
    public Payment getById(@PathVariable int id){
        return this.paymentRepository.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddPaymentRequest request){
        this.paymentRepository.findAll();
    }
}
