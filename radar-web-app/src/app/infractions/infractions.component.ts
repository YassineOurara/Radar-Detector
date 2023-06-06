import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent implements OnInit{
  infractions : any;
    constructor(private  http:HttpClient) { }

    ngOnInit(): void {
      this.http.get("http://localhost:8888/RADAR-SERVICE/rest/infractions/all").subscribe(
        { next:(data)=>{
            this.infractions = data;
          },
          error : (err)=>{}
        });
    }}
