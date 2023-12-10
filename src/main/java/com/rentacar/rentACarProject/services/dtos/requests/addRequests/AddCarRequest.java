package com.rentacar.rentACarProject.services.dtos.requests.addRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {
    private Integer model_year;
    private String fuelType;
}
