import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AutentComponent } from './autent.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [{
  path: '',
  component: AutentComponent,
  children: [
    {
      path: 'login',
      component: LoginComponent,
    },
    {
      path: '',
      redirectTo: 'login',
      pathMatch: 'full',
    },
    {
      path: '**',
      component: LoginComponent,
    },
  ],
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AuthRoutingModule {
}
