package com.marubeni.cmmbackend.service.concretes;

import com.marubeni.cmmbackend.core.utilities.mapper.absracts.ModelMapperService;
import com.marubeni.cmmbackend.dto.response.GetAllInformationResponse;
import com.marubeni.cmmbackend.entity.concretes.Information;
import com.marubeni.cmmbackend.repository.abstracts.InformationRepository;
import com.marubeni.cmmbackend.service.abstracts.InformationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InformationManager implements InformationService {
    private ModelMapperService modelMapperService;
    private InformationRepository informationRepository;

    public InformationManager(ModelMapperService modelMapperService, InformationRepository informationRepository) {
        this.modelMapperService = modelMapperService;
        this.informationRepository = informationRepository;
    }

    @Override
    public List<GetAllInformationResponse> getAll() {
        List<Information> informations = informationRepository.findAll();
        List<GetAllInformationResponse> informationResponses = informations.stream()
                .map(information -> this.modelMapperService.forResponse().map(information, GetAllInformationResponse.class))
                .collect(Collectors.toList());

        return informationResponses;
    }
}
