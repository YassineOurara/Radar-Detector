import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VehiclesComponent} from "./vehicles/vehicles.component";
import {InfractionsComponent} from "./infractions/infractions.component";

const routes: Routes = [
{
  path : "vehicles",component:VehiclesComponent
  },
  {
      path : "infractions",component:InfractionsComponent
   }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
