import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stock-manager',
  templateUrl: './stock-manager.component.html',
  styleUrls: ['./stock-manager.component.css']
})
export class StockManagerComponent implements OnInit {

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
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }

  getAllProducts() {
  this.service.getAllProducts().subscribe( data => {
  console.log(data.assetProductBeans);
  this.products = data.assetProductBeans;
  console.log(this.products);
  }, err => {
  console.log(err);
  }, () => {
  console.log('success');
  });
  }

}
