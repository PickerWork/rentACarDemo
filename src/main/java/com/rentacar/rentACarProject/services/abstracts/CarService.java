package com.rentacar.rentACarProject.services.abstracts;

import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddBrandRequest;
import com.rentacar.rentACarProject.services.dtos.responses.getResponses.GetBrandResponse;

public interface CarService {
    void add(AddBrandRequest request);
    GetBrandResponse getById(int id);
}
