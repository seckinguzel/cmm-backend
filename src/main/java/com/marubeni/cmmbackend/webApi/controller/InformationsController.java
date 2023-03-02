package com.marubeni.cmmbackend.webApi.controller;

import com.marubeni.cmmbackend.dto.response.GetAllInformationResponse;
import com.marubeni.cmmbackend.service.abstracts.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/informations")
public class InformationsController {
    private InformationService informationService;

    public InformationsController(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping("/getall")
    public List<GetAllInformationResponse> getAll(){
        return informationService.getAll();
    }
}
