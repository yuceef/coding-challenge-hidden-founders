import { Component, OnInit } from '@angular/core';
import {AuthService} from "../../services/auth.service";
import {User} from "../../model/model.user";
import {Router} from "@angular/router";
import { Shop } from '../../model/model.shop';
import Axios from 'axios'
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  currentUser: User;
  nearbyShops: Shop[];
  options: Object;
  constructor() {
    this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    var base64Credential: string = btoa( this.currentUser.username+ ':' + this.currentUser.password);
    this.options = {
      "headers":{
        "Accept": "application/json",
        "Authorization": "Basic " + base64Credential
      }
    };
    this.getShops();    
  }

  ngOnInit() {
  }
  onClickLike(shop: Shop): void  {
    Axios.post("http://localhost:8080/api/like/"+shop.id, this.currentUser, this.options).then((res)=>{
      this.getShops()
    })
  }
  onClickDislike(shop: Shop): void  {
    Axios.post("http://localhost:8080/api/dislike/"+shop.id, this.currentUser, this.options).then((res)=>{
      this.getShops()
    })
  }
  getShops() {
    Axios.post("http://localhost:8080/api/nearby", this.currentUser, this.options).then((res)=>{
      this.nearbyShops = res.data
    })
  }
}
