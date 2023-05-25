package com.sda.plantstoreopl.service;

import java.util.List;

import com.sda.plantstoreopl.dto.PlantDto;
import com.sda.plantstoreopl.entity.Plant;
import com.sda.plantstoreopl.repository.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;

    public List<PlantDto> getPlants() {
        return plantRepository.findAll().stream()
                              .map(p -> new PlantDto(p.getId(), p.getName(), p.getImageName(), p.getPrice().toString()))
                              .toList();
    }
}
