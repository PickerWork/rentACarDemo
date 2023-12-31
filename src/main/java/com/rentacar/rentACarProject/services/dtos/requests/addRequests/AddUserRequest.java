package com.rentacar.rentACarProject.services.dtos.requests.addRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {
    private String name;
    private String surname;
    private String gsm;
    private String email;
}
