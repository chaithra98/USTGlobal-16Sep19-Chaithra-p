import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { StudentdataComponent } from './studentdata/studentdata.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { FilterPipe } from './filter.pipe';
import { UpdateComponent } from './update/update.component';
import { SideNavbarComponent } from './side-navbar/side-navbar.component';
import { AddBookComponent } from './add-book/add-book.component';
import { BookListComponent } from './book-list/book-list.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    HomeComponent,
    UserComponent,
    RegisterComponent,
    StudentdataComponent,
    RequestBookComponent,
    FilterPipe,
    UpdateComponent,
    SideNavbarComponent,
    AddBookComponent,
    BookListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
