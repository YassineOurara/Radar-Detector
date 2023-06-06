import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VehiclesComponent } from './vehicles/vehicles.component';
import {HttpClientModule} from "@angular/common/http";
import { InfractionsComponent } from './infractions/infractions.component';

@NgModule({
  declarations: [
    AppComponent,
    VehiclesComponent,
    InfractionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
