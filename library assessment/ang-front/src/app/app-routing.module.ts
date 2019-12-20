import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { StudentdataComponent } from './studentdata/studentdata.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { UpdateComponent } from './update/update.component';
import { AddBookComponent } from './add-book/add-book.component';
import { BookListComponent } from './book-list/book-list.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'header',component:HeaderComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'student-data',component:StudentdataComponent},
  {path:'request-book',component:RequestBookComponent},
  {path:'update',component: UpdateComponent},
  {path:'add-book',component:AddBookComponent},
  {path:'book-list',component:BookListComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]


})
export class AppRoutingModule { }
