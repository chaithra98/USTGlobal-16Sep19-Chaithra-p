import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all',
  templateUrl: './get-all.component.html',
  styleUrls: ['./get-all.component.css']
})
export class GetAllComponent implements OnInit {

  constructor(private service: AuthService, private router: Router) {
    this.getAllProducts();
   }

  products = new Array();
  error: string;
  selectedProduct;
  ngOnInit() {
  }

  modify(form) {
    this.error = null;
    this.selectedProduct = form;
  }
  modifyProduct(form) {
    console.log(form.value);
    this.service.modifyProduct(form.value).subscribe(data => {
      console.log(data);
      this.getAllProducts();
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }

  searchProduct() {
    this.service.searchProduct().subscribe(data => {
      console.log(data.products);
      this.products = data.products;
      console.log(this.products);
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }

  getAllProducts() {
  this.service.getAllProducts().subscribe( data => {
  console.log(data.productBeans);
  this.products = data.productBeans;
  console.log(this.products);
  }, err => {
  console.log(err);
  }, () => {
  console.log('success');
  });
  }

}
