import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VehiclesComponent } from './vehicles/vehicles.component';
import {HttpClientModule} from "@angular/common/http";
import { InfractionsComponent } from './infractions/infractions.component';
import { InfractiondetailComponent } from './infractiondetail/infractiondetail.component';
import { VehicledetailComponent } from './vehicledetail/vehicledetail.component';
import { RadarComponent } from './radar/radar.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { RadardetailComponent } from './radardetail/radardetail.component';

@NgModule({
  declarations: [
    AppComponent,
    VehiclesComponent,
    InfractionsComponent,
    InfractiondetailComponent,
    VehicledetailComponent,
    RadarComponent,
    RadardetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
