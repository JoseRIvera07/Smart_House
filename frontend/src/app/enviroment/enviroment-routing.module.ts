import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

import { EnviromentComponent } from './enviroment.component';
import { SmartHomeComponent } from './smarthome/smarthome.component';

const routes: Routes = [
  {
      path: 'smarthome',
      component: SmartHomeComponent,
  },
  { path: '', redirectTo: 'smarthome', pathMatch: 'full' },
  { path: '**', redirectTo: 'smarthome' },
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class EnviromentRoutingModule {
}
