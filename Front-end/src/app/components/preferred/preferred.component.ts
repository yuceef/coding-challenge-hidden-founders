import { Component, OnInit } from '@angular/core';
import { User } from '../../model/model.user';
import Axios from 'axios';
import { InteractLike } from 'src/app/model/model.InteractLike';

@Component({
  selector: 'app-preferred',
  templateUrl: './preferred.component.html',
  styleUrls: ['./preferred.component.css']
})
export class PreferredComponent implements OnInit {

  currentUser: User;
  preferredShops: InteractLike[];
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
    this.getPreferredShops();
  }

  ngOnInit() {
  }

  getPreferredShops() {
    Axios.post("http://localhost:8080/api/preferred", this.currentUser, this.options).then((res)=>{
      this.preferredShops = res.data
    })
  }

  onClickRemove(id) {
    Axios.post("http://localhost:8080/api/removelike/"+id, {}, this.options).then((res)=>{
      if(res.data){
        this.getPreferredShops()
      }
    })
  }
}
