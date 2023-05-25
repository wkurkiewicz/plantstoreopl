package com.sda.plantstoreopl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlantDto {
    private Long id;
    private String name;
    private String imageName;
    private String price;
}
