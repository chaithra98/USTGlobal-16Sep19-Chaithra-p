import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import {Librarian} from '../studentdata/librarian';

@Component({
  selector: 'app-studentdata',
  templateUrl: './studentdata.component.html',
  styleUrls: ['./studentdata.component.css']
})
export class StudentdataComponent implements OnInit {

  librarian;
  constructor( private service: RegisterService) {
    console.log('constructor got excecuted');
    this.getData();
  }
  getData(){
  console.log('hi from student component');
  this.service.getData().subscribe(res => {
     console.log(res);
          this.librarian = res;
      },err=>{
          console.log(err);
      });
      console.log ('subscription ended');
  }
  deleteData(student){
    console.log(student);
    this.service.deleteUser(student.student_id).subscribe(data =>{
    console.log(data);
    this.getData();
    },err=>{
        console.log(err);
    },()=>{
        console.log('data deleted successfully');
    })
    }
  ngOnInit(){}
}