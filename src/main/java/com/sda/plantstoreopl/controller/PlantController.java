package com.sda.plantstoreopl.controller;

import java.util.List;

import com.sda.plantstoreopl.dto.PlantDto;
import com.sda.plantstoreopl.service.PlantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8081/plants <- GET
@Controller
@RequestMapping("/plants")
@RequiredArgsConstructor
@Slf4j
public class PlantController {

    private final PlantService plantService;

    @GetMapping
    public String plants(Model model) {
        List<PlantDto> plantsFromDb = plantService.getPlants();
        model.addAttribute("plants", plantsFromDb);
        return "plants";
    }

    @GetMapping
    @RequestMapping("/details/{plantId}")
    public String plantDetails(Model model, @PathVariable long plantId) {
        //TODO pobrać informacje o roślinie po id i wrzucić to na model
        //plantService.getPlantById(plantId);

        log.info("plantId = " + plantId);
        return "plant-details";
    }

}
