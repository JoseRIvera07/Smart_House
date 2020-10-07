import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';  
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { AuthRoutingModule } from './auth-routing.module';
import { AuthComponent } from './auth.component';
import { LoginComponent } from './login/login.component';
import { ShowHidePasswordModule } from 'ngx-show-hide-password';
import { AuthService } from '../services/auth.service';

@NgModule({
  imports: [
    CommonModule,
    AuthRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    ShowHidePasswordModule,
  ],
  declarations: [
    AuthComponent,
    LoginComponent
  ],
  providers:[
     AuthService
  ]
})
export class AuthModule {}
