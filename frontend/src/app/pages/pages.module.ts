import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';  

import { PagesRoutingModule } from './pages-routing.module';
import { PagesComponent } from './pages.component';
import { HomeComponent } from './home/home.component'

@NgModule({
  imports: [
    PagesRoutingModule,
    CommonModule
  ],
  declarations: [
    PagesComponent,
    HomeComponent
  ],
})
export class PagesModule {
}
