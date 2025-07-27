package com.codebase.microservices.VaccinationCenter.clients;

import com.codebase.microservices.VaccinationCenter.clients.fallback.CitizenClientFallback;
import com.codebase.microservices.VaccinationCenter.model.Citizen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(contextId = "citizenClient", name = "CITIZEN-SERVICE", fallback = CitizenClientFallback.class)
public interface CitizenClient {

    @GetMapping("/citizen/id/{id}")
    List<Citizen> getCitizensById(@PathVariable Integer id);

}
