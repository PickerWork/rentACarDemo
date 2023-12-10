package com.rentacar.rentACarProject.services.concretes;

import com.rentacar.rentACarProject.entities.Brand;
import com.rentacar.rentACarProject.repositories.BrandRepository;
import com.rentacar.rentACarProject.services.abstracts.BrandService;
import com.rentacar.rentACarProject.services.dtos.requests.addRequests.AddBrandRequest;
import com.rentacar.rentACarProject.services.dtos.responses.getListResponses.GetBrandListResponse;
import com.rentacar.rentACarProject.services.dtos.responses.getResponses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Override
    public void add(AddBrandRequest request) {
        if(request.getName().length()<2)
            throw new RuntimeException("Marka adı 2 haneden kısa olamaz");

        Brand brand = new Brand();
        brand.setName(request.getName()); //kullanıcıdan brand bilgisini al > sunucuya istek gönder > requestle veritabanına yaz
        brandRepository.save(brand);
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();
        GetBrandResponse getBrandResponse = new GetBrandResponse();
        getBrandResponse.setName(brand.getName());
        return getBrandResponse;
    }
}
