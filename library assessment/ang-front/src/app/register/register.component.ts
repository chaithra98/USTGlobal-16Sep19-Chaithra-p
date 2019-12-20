import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor( private service:RegisterService) {}
  register(form: NgForm){
      this.service.registerUser(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
      },err=>{
          console.log(err);
      });
  }
  ngOnInit(){}
}  