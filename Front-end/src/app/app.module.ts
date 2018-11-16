import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { FormsModule } from '@angular/forms';
import { AuthService } from "./services/auth.service";
import {HttpModule} from "@angular/http";
import {AccountService} from "./services/account.service";
import { HomeComponent } from './components/home/home.component';
import {routing} from "./app.routing";
import {FacebookModule} from "ngx-facebook";
import {UrlPermission} from "./urlPermission/url.permission";
import { PreferredComponent } from './components/preferred/preferred.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    PreferredComponent,
  ],
  imports: [
    BrowserModule,HttpModule,FormsModule,routing, FacebookModule.forRoot(),
  ],
  providers: [AuthService,AccountService,UrlPermission],
  bootstrap: [AppComponent]
})
export class AppModule { }
