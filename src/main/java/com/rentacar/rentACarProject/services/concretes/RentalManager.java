package com.rentacar.rentACarProject.services.concretes;

import com.rentacar.rentACarProject.services.abstracts.RentalService;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddBrandRequest;
import com.rentacar.rentACarProject.services.dtos.responses.getResponses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    @Override
    public void add(AddBrandRequest request) {

    }

    @Override
    public GetBrandResponse getById(int id) {
        return null;
    }
}
