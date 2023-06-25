import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-vehicledetail',
  templateUrl: './vehicledetail.component.html',
  styleUrls: ['./vehicledetail.component.css']
})
export class VehicledetailComponent implements OnInit  {
  vehicledetail : any;
  vehicleId !:number;
  constructor(private  http:HttpClient , private  router : Router,private route :ActivatedRoute) {
    this.vehicleId=route.snapshot.params['vehicleId']

  }

  ngOnInit(): void {

  this.http.get("http://localhost:8888/IMMATRICULATION-SERVICE/vehicles/"+this.vehicleId+"/owner").subscribe(
      { next:(data)=>{
          this.vehicledetail = data;
        },
        error : (err)=>{}
      });
  }}
