package com.marubeni.cmmbackend.service.abstracts;

import com.marubeni.cmmbackend.dto.response.GetAllInformationResponse;

import java.util.List;

public interface InformationService {
    List<GetAllInformationResponse> getAll();
}
