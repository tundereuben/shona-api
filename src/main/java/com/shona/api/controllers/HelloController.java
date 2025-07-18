package com.shona.api.controllers;

import com.shona.api.ServicesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final ServicesService servicesService;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    public HelloController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @GetMapping("/names")
    public List<String> getServiceNames() {
        return servicesService.getAllServiceNames();
    }
}
