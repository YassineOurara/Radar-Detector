package org.sid.immatriculationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.immatriculationservice.enums.Brand;

import java.time.Year;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleResponseDTO {
    private Long registration_plate_number;
    private Brand brand;
    private Double tax_horsepower;
    private Year vehicle_model;
    private String ownerName;
}
