package com.rentacar.rentACarProject.controllers;

import com.rentacar.rentACarProject.services.abstracts.BrandService;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddBrandRequest;
import com.rentacar.rentACarProject.services.dtos.responses.getResponses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;

    @GetMapping("{id}")
    public GetBrandResponse getById(@PathVariable int id){
        return this.brandService.getById(id);
    }

    @PostMapping
    public void add (@RequestBody AddBrandRequest request){
        this.brandService.add(request);
    }
}
