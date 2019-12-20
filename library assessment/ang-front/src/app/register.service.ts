import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable <any>{
    return this.http.post('http://localhost:8080/library/librarian/add',user);
  }
  loginUser(user): Observable <any>{
    return this.http.post(`http://localhost:8080/library/user/login/${user.email}/${user.password}/${user.role}`, user);
}
  getData(): Observable <any>{
  return this.http.get('http://localhost:8080/library/librarian/get-all');
}
  deleteUser( student_id : number): Observable<any>{
    return this.http.delete(`http://localhost:8080/library/librarian/delete/${student_id}`);
  }
  updateUser(user): Observable<any>{
    return this.http.put(`http://localhost:8080/library/librarian/modify`, user);
  }
  requestbook(user): Observable <any>{
    return this.http.post('http://localhost:8080/library/book/add1',user);
  }
  addbookforstudent(user): Observable <any>{
    return this.http.post('http://localhost:8080/library/book/add1',user);
  }
  deletebookforstudent(book_id:number): Observable <any>{
    return this.http.delete(`http://localhost:8080/library/book/delete/${book_id}`);
  }
  getBooks(): Observable <any>{
    return this.http.get('http://localhost:8080/library/book/get-all');
  }
}