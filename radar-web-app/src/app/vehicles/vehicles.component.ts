import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent implements OnInit{
  vehicles : any;
    constructor(private  http:HttpClient) { }

    ngOnInit(): void {
      this.http.get("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles").subscribe(
        { next:(data)=>{
            this.vehicles = data;
          },
          error : (err)=>{}
        });
    }}
