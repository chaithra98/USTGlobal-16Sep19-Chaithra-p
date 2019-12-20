import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  addProduct(user): Observable<any> {
    return this.http.post('http://localhost:8080/add', user);
  }

  modifyProduct(user): Observable<any> {
    return this.http.put('http://localhost:8080/modify', user);
  }

  searchProduct(): Observable<any> {
    return this.http.get('http://localhost:8080/search');
  }

  getAllProducts(): Observable<any> {
    return this.http.get('http://localhost:8080/get-all');
  }
}
