import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {RegisterComponent} from "./components/register/register.component";
import {HomeComponent} from "./components/home/home.component";
import {UrlPermission} from "./urlPermission/url.permission";
import { PreferredComponent } from './components/preferred/preferred.component';


const appRoutes: Routes = [
  { path: 'home', component: HomeComponent ,canActivate: [UrlPermission] },
  { path: 'preferred', component: PreferredComponent ,canActivate: [UrlPermission] },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },

  // otherwise redirect to profile
  { path: '**', redirectTo: '/login' }
];

export const routing = RouterModule.forRoot(appRoutes);
