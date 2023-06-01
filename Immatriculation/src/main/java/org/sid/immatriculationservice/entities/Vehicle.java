package org.sid.immatriculationservice.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.immatriculationservice.enums.Brand;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@XmlRootElement(name = "Vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlElement(name = "registration_plate_number")
    private Long registration_plate_number;
    @XmlElement
    @Enumerated(EnumType.STRING)
    private Brand brand;
    @XmlElement(name = "tax_horsepower")
    private Long tax_horsepower;
    @XmlElement
    private Long vehicle_model;
    @ManyToOne
    @XmlTransient
    private Owner owner;

}

