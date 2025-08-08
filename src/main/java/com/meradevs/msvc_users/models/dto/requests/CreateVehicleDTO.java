package com.meradevs.msvc_users.models.dto.requests;


import com.meradevs.msvc_users.models.dto.VehicleCategoryDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateVehicleDTO {

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @NotBlank
    private String color;

    @NotBlank
    @Min(1900)
    private Integer year;

    @NotBlank
    private VehicleCategoryDTO category;

    private String licensePlate;

    private byte[] license;
}