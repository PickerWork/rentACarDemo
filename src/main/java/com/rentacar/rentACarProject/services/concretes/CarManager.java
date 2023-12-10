package com.rentacar.rentACarProject.services.concretes;

import com.rentacar.rentACarProject.services.abstracts.CarService;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddBrandRequest;
import com.rentacar.rentACarProject.services.dtos.responses.getResponses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    @Override
    public void add(AddBrandRequest request) {

    }

    @Override
    public GetBrandResponse getById(int id) {
        return null;
    }
}
