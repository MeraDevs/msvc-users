package com.meradevs.msvc_users.models.dto;

import com.meradevs.msvc_users.models.enums.VehicleType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class VehicleCategoryDTO {

    private Long id;

    private String name;

    private VehicleType type;
}
