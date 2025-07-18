package com.shona.api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    private final ServiceRepository serviceRepository;

    public ServicesService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<String> getAllServiceNames() {
        return serviceRepository.findAllServiceNames();
    }
}
