import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {RadarServiceService} from "../services/radar-service.service";
@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent implements OnInit{
  infractions : any;
   err!:any;
    constructor(private radarService:RadarServiceService, private  router : Router) { }

    ngOnInit(): void {
      this.radarService.getInfractions().subscribe(
        { next:(data)=>{
            this.infractions = data;
          },
          error : (err)=>{ console.log(err);}
        });
    }
      getInfractionDetail(i: any) {
        this.router.navigateByUrl("/infractiondetail/"+i.id)

      }
  deleteInfraction(id: any) {
    // Get confirmation from the user
    if (confirm("Are you sure you want to delete this infraction?")) {
      // Delete the infraction
      this.radarService.deleteInfraction(id).subscribe({
        next: () => {
          window.alert("Infraction deleted successfully!");
          // Refresh the page
          window.location.reload();
        },
        error: err => console.log(err)
      });
    }
  }

}
