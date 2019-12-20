import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
book;
issue_date=Date.now();
end_date=Date.now();
  constructor( private service:RegisterService) {
  console.log('constructor got excecuted');
  this.getBooks();
}
getBooks(){
console.log('hi from book component');
this.service.getBooks().subscribe(res => {
   console.log(res);
        this.book = res;
    },err=>{
        console.log(err);
    });
    console.log ('subscription ended');
}
  addbook(form: NgForm){
      this.service.addbookforstudent(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
      },err=>{
          console.log(err);
      });
  }
  deleteBook(books){
    console.log(books);
    this.service.deletebookforstudent(books.book_id).subscribe(data =>{
    console.log(data);
    },err=>{
        console.log(err);
    },()=>{
        console.log('book deleted successfully');
    })
    }
  ngOnInit(){}
}  

