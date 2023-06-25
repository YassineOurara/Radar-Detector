import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {RadarServiceService} from "../services/radar-service.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent implements OnInit{
  vehicles : any;
  private savedVehicle!: Object;
  private savedOwner!: Object;
    constructor(private  radarService:RadarServiceService, private  router : Router, private formBuilder: FormBuilder) { }

    ngOnInit(): void {
      this.radarService.getVehicles().subscribe(
        { next:(data)=>{
            this.vehicles = data;
          },
          error : (err)=>{}
        });
      this.initFormBuilder();
    }
  getVehicleDetail(i: any) {
    this.router.navigateByUrl("/vehicledetail/"+i.id)

  }
  deleteVehicle(id: any) {
    // Get confirmation from the user
    if (confirm("Are you sure you want to delete this vehicle?")) {
      // Delete the infraction
      this.radarService.deleteVehicle(id).subscribe({
        next: () => {
          // Show success message
          window.alert("Vehicle deleted successfully!");

          // Refresh the page
          window.location.reload();
        },
        error: err => console.log(err)
      });
    }
  }

  isFormPopupOpen: boolean = false;

  openFormPopup() {
    this.isFormPopupOpen = true;
    this.newVehicleForm.reset(); // Reset the form
  }


  closeFormPopup() {
    this.isFormPopupOpen = false;
  }
  public newVehicleForm!: FormGroup;
  saveNewVehicle() {
    let vehicleRegNumber = this.newVehicleForm.get("registration_plate_number")?.value;
    let vehicleBrand = this.newVehicleForm.get("brand")?.value;
    let vehicleFiscalPower = this.newVehicleForm.get("tax_horsepower")?.value;
    let vehicleModel = this.newVehicleForm.get("model")?.value;
    let vehicleOwnerName = this.newVehicleForm.get("ownerName")?.value;
    let vehicleOwnerBirthdate = this.newVehicleForm.get("ownerBirthdate")?.value;
    let vehicleOwnerEmail = this.newVehicleForm.get("ownerEmail")?.value;
    let vehicle = {
      "registration_plate_number": vehicleRegNumber,
      "brand": vehicleBrand,
      "tax_horsepower": vehicleFiscalPower,
      "model": vehicleModel,
    };
    let owner = {
      "name": vehicleOwnerName,
      "birthdate": vehicleOwnerBirthdate,
      "email": vehicleOwnerEmail
    };

    this.radarService.saveVehicle(vehicle).subscribe({
      next: data => this.savedVehicle = data,
      error: err => console.log(err)
    });
    this.radarService.saveOwner(owner).subscribe({
      next: data => this.savedOwner = data,
      error: err => console.log(err)
    });
    this.radarService.addVehicleToOwner(this.savedVehicle, this.savedOwner).subscribe({
      next: data => console.log(data),
    });
  }

  private initFormBuilder() {
    this.newVehicleForm = this.formBuilder.group({
      regNumber: this.formBuilder.control('', [Validators.required]),
      brand: this.formBuilder.control('', [Validators.required]),
      fiscalPower: this.formBuilder.control('', [Validators.required]),
      model: this.formBuilder.control('', [Validators.required]),
      ownerName: this.formBuilder.control('', [Validators.required]),
      ownerBirthdate: this.formBuilder.control('', [Validators.required]),
      ownerEmail: this.formBuilder.control('', [Validators.required]),
    });
  }

}
