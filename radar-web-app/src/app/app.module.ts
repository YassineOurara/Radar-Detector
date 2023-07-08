// import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { APP_INITIALIZER, NgModule } from '@angular/core';
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
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { IndexComponent } from './index/index.component';



function initializeKeycloak(keycloak: KeycloakService) {
  return () =>
    keycloak.init({
      config: {
        url: 'http://localhost:8080/',
        realm: 'radar-realm',
        clientId: 'radar-client',
      },
      initOptions: {
        onLoad: 'login-required',
        flow: 'standard',
      },
    });
}

@NgModule({
  declarations: [
    AppComponent,
    VehiclesComponent,
    InfractionsComponent,
    InfractiondetailComponent,
    VehicledetailComponent,
    RadarComponent,
    RadardetailComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    KeycloakAngularModule,
    FormsModule
  ],
  providers: [   
    {
    provide: APP_INITIALIZER,
    useFactory: initializeKeycloak,
    multi: true,
    deps: [KeycloakService],
  },
],
  bootstrap: [AppComponent]
})
export class AppModule { }
