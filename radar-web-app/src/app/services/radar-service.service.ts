import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Radar} from "../model/radar.model";
import {Vehicle} from "../model/vehicle.model";
import {Infraction} from "../model/infraction.model";

@Injectable({
  providedIn: 'root'
})
export class RadarServiceService {

  constructor(private http: HttpClient) { }
  public getRadars():Observable<Array<Radar>>{
    return this.http.get<Array<Radar>>("http://localhost:8888/RADAR-SERVICE/rest/radars")
  }

  public getRadar(id: any):Observable<Radar>{
    return this.http.get<Radar>("http://localhost:8888/RADAR-SERVICE/rest/radars/"+id)
  }
  saveRadar(Radar: any) {
    return this.http.post("http://localhost:8888/RADAR-SERVICE/rest/radars", Radar)
  }
  deleteRadar(id: any) {
    return this.http.delete("http://localhost:8888/RADAR-SERVICE/rest/radars/"+id)
  }
  addInfraction(radarId: any, vehicleId: any, infraction: any) {
    return this.http.post("http://localhost:8888/RADAR-SERVICE/rest/radars/"+radarId+"/vehicles/"+vehicleId + "?speed=" + infraction, infraction)
  }

  public getVehicles():Observable<Array<Vehicle>>{
    return this.http.get<Array<Vehicle>>("http://localhost:8888/RADAR-SERVICE/rest/vehicles/all")
  }

  deleteVehicle(id: any) {
    return this.http.delete("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles/"+id)
  }

  saveVehicle(vehicle: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles", vehicle)
  }

  saveOwner(owner: { birthdate: any; name: any; email: any }) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/owners", owner)
  }

  addVehicleToOwner(savedVehicle: any, savedOwner: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles/"+savedVehicle.id+"/owners/"+savedOwner.id, savedOwner);
  }

  public getInfractions():Observable<Array<Infraction>>{
    return this.http.get<Array<Infraction>>("http://localhost:8888/RADAR-SERVICE/rest/infractions/all")
  }



  deleteInfraction(id: any) {
    return this.http.delete("http://localhost:8888/INFRACTION-SERVICE/rest/infractions/"+id)
  }





}
