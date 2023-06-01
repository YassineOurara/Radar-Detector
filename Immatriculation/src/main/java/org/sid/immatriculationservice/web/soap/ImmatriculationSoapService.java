package org.sid.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component @AllArgsConstructor
@WebService(serviceName = "ImmatriculationWS")
public class ImmatriculationSoapService {
    private VehicleRepository vehicleRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @WebMethod
    public List<Vehicle> vehiclesList(){
        return vehicleRepository.findAll();
    }
    @WebMethod
    public Vehicle vehicleById(@WebParam(name="id") Long id){
        return vehicleRepository.findById(id).get();
    }

    @WebMethod
    public List<Owner> ownersList(){
        return ownerRepository.findAll();
    }

}
