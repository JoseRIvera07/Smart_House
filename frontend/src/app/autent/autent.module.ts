import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';  
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { AuthRoutingModule } from './autent-routing.module';
import { AutentComponent } from './autent.component';
import { LoginComponent } from './login/login.component';
import { ShowHidePasswordModule } from 'ngx-show-hide-password';
import { AutentService } from '../services/autent.service';

@NgModule({
  imports: [
    CommonModule,
    AuthRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    ShowHidePasswordModule,
  ],
  declarations: [
    AutentComponent,
    LoginComponent
  ],
  providers:[
     AutentService
  ]
})
export class AutentModule {}
