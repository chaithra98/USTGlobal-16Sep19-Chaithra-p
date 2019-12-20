import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm } from '@angular/forms';
import { Librarian } from '../studentdata/librarian';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor( private service: RegisterService,private router:Router) {}
  update(form: NgForm){
    this.service.updateUser(form.value)
    .subscribe(res =>
      {
        console.log(res);
        form.reset();
        if(res.message=='login successfull'){
          this.router.navigate(['/student-data']);
        }
    },err=>{
        console.log(err);
    });
}
ngOnInit(){
}
}