package org.sid.immatriculationservice.web;

import lombok.AllArgsConstructor;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ImmatriculationGraphQLController {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @QueryMapping
    public List<Vehicle> vehiclesList(){
        return vehicleRepository.findAll();
    }
    @QueryMapping
    public Vehicle vehicleById(@Argument Long id){
        return vehicleRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Vehicle %s not found",id)));
    }
    @QueryMapping
    public List<Owner> ownersList(){
        return ownerRepository.findAll();
    }
}
