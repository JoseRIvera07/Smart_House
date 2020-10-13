import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';  

import { EnviromentRoutingModule } from './enviroment-routing.module';
import { EnviromentComponent } from './enviroment.component';
import { SmartHomeComponent } from './smarthome/smarthome.component'

@NgModule({
  imports: [
    EnviromentRoutingModule,
    CommonModule
  ],
  declarations: [
    EnviromentComponent,
    SmartHomeComponent
  ],
})
export class EnviromentModule {
}
