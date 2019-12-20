import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {

  constructor( private service:RegisterService) {}
  register(form: NgForm){
      this.service.requestbook(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
      },err=>{
          console.log(err);
      });
  }
  ngOnInit(){}
}