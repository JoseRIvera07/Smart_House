import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {
    path: 'autent',
    loadChildren: './autent/autent.module#AutentModule'
  },{
    path: 'enviroment',
    loadChildren: () => import('./enviroment/enviroment.module')
      .then(m => m.EnviromentModule),
  },
  { path: '', redirectTo: 'autent', pathMatch: 'full' },
  { path: '**', redirectTo: 'autent' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
