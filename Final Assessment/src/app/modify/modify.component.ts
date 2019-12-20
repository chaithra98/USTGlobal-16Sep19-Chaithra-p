import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { Validators, FormControl, FormGroup, NgForm } from '@angular/forms';

@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent {
  message;
  get id() {
    return this.form.get('id');
  }
  get name() {
    return this.form.get('id');
  }
  get price() {
    return this.form.get('id');
  }
  get quantity() {
    return this.form.get('id');
  }

  constructor(private auth: AuthService, private router: Router) { }
  form = new FormGroup({
    pid : new FormControl('', [Validators.required]),
    pname : new FormControl(''),
    pprice : new FormControl(''),
    quantity : new FormControl('')
  });
  error: string;

  modify(form: NgForm) {
    this.error = null;
    console.log(form);
    this.auth.modifyProduct(form.value).subscribe(res => {
      console.log(res);
      alert('Modified successfully');
      this.router.navigateByUrl('/get-all');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

}
