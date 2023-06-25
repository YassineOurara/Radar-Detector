import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VehiclesComponent} from "./vehicles/vehicles.component";
import {InfractionsComponent} from "./infractions/infractions.component";
import { InfractiondetailComponent } from './infractiondetail/infractiondetail.component';
import {VehicledetailComponent} from "./vehicledetail/vehicledetail.component";

const routes: Routes = [
{
  path : "vehicles",component:VehiclesComponent
  },
  {
      path : "infractions",component:InfractionsComponent
   },
     {
         path : "infractiondetail/:infractionId",component:InfractiondetailComponent
      },
  {
    path : "vehicledetail/:vehicleId",component:VehicledetailComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
