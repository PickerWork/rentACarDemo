package com.rentacar.rentACarProject.services.dtos.requests.addRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddRentalRequest {
    private String startDate;
    private String endDate;
    private boolean active;
}
