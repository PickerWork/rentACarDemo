package com.rentacar.rentACarProject.services.dtos.responses.getResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetRentalResponse {
    private String startDate;
    private String endDate;
    private boolean active;
}
