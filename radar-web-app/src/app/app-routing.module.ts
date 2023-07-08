import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VehiclesComponent} from "./vehicles/vehicles.component";
import {IndexComponent} from "./index/index.component";

import {InfractionsComponent} from "./infractions/infractions.component";
import { InfractiondetailComponent } from './infractiondetail/infractiondetail.component';
import {VehicledetailComponent} from "./vehicledetail/vehicledetail.component";
import {RadarComponent} from "./radar/radar.component";
import {RadardetailComponent} from "./radardetail/radardetail.component";

const routes: Routes = [
{
  path : "vehicles",component:VehiclesComponent
  },
  {
    path : "index",component:IndexComponent
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
  {
    path : "radars",component:RadarComponent
  },  {
    path : "radardetail/:radarId",component:RadardetailComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
