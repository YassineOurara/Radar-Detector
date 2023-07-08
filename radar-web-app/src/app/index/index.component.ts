import { Component, OnInit } from '@angular/core';
import { KeycloakAngularModule , KeycloakService } from 'keycloak-angular';
@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})

export class IndexComponent implements OnInit {
  username = '';

  constructor(private keycloakService: KeycloakService){

  }
  ngOnInit(): void {
    this.intializeOption();
  }
  intializeOption() {
    this.username = this.keycloakService.getUsername();
  }

}