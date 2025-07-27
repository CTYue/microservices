package com.codebase.microservices.VaccinationCenter.clients.fallback;

import com.codebase.microservices.VaccinationCenter.clients.CitizenClient;
import com.codebase.microservices.VaccinationCenter.model.Citizen;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CitizenClientFallback implements CitizenClient {

    @Override
    public List<Citizen> getCitizensById(Integer id) {
        // 当CITIZEN_SERVICE
        return Collections.emptyList();
    }

}
