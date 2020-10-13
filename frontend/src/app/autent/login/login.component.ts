import { Component } from '@angular/core';
import { AutentService } from '../../services/autent.service';
import { Router } from '@angular/router'



@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent  {

  password: string
  username: string

  constructor(private authService:AutentService, private router:Router){
  }

  logIn(){
    let temp ={
      email:this.username,
      password:this.password
    };
    this.authService.logIn(temp)
      .subscribe((data) =>{
        if(data.success){
          this.router.navigateByUrl("enviroment");
        }
    });
  }
  
}