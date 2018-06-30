import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DetailsComponent } from './details/details.component';
import { FormDataComponent } from './form-data/form-data.component';

const routes: Routes = [
  {
    path: 'app-details',
    component: DetailsComponent
  },
  {
    path: 'form-data',
    component: FormDataComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [FormDataComponent];
