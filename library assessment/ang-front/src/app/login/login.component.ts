import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm, FormGroup, Validators, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

logins="false";

  constructor( private service:RegisterService,private router:Router) {}

  login(form: NgForm){
    if(form.value.role=='admin'){
      this.service.loginUser(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
          // tslint:disable-next-line: no-conditional-assignment
          if(res.message = 'login successfull'){
            this.router.navigate(['/student-data']);
          }
      },err=>{
          console.log(err);
      });
  
// tslint:disable-next-line: align
}else{
  this.router.navigate(['/request-book']);
}
  }
  ngOnInit(){}
}