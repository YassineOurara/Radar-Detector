import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
@Component({
  selector: 'app-infractiondetail',
  templateUrl: './infractiondetail.component.html',
  styleUrls: ['./infractiondetail.component.css']
})
export class InfractiondetailComponent implements OnInit  {
  infractiondetail : any;
  infractionId !:number;
  constructor(private  http:HttpClient , private  router : Router,private route :ActivatedRoute) {
    this.infractionId=route.snapshot.params['infractionId']

  }

  ngOnInit(): void {

    this.http.get("http://localhost:8888/RADAR-SERVICE/rest/infractions/"+this.infractionId).subscribe(
      { next:(data)=>{
          this.infractiondetail = data;
        },
        error : (err)=>{}
      });
    }}
