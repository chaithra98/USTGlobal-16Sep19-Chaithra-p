import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor( private service:RegisterService) {}
  addbook(form: NgForm){
      this.service.addbookforstudent(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
      },err=>{
          console.log(err);
      });
  }
  deleteData(book){
    console.log(book);
    this.service.deletebookforstudent(book.book_id).subscribe(data =>{
    console.log(data);
    },err=>{
        console.log(err);
    },()=>{
        console.log('data deleted successfully');
    })
    }
  ngOnInit(){}
}  
