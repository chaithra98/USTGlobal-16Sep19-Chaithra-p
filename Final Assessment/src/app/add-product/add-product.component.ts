import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) { }
  error: string;

  add(form: NgForm) {
    this.error = null;
    this.auth.addProduct(form.value).subscribe(res => {
      console.log(res);
      alert('Added successfully');
      this.router.navigateByUrl('/get-all');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}