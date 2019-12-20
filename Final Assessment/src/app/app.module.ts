import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { StockManagerComponent } from './stock-manager/stock-manager.component';
import { FormsModule } from '@angular/forms';
import { AddProductComponent } from './add-product/add-product.component';
import { SearchProductComponent } from './search-product/search-product.component';
import { FilterPipe } from './filter.pipe';
import { HttpClientModule } from '@angular/common/http';
import { GetAllComponent } from './get-all/get-all.component';
import { ModifyComponent } from './modify/modify.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    StockManagerComponent,
    AddProductComponent,
    SearchProductComponent,
    FilterPipe,
    GetAllComponent,
    ModifyComponent,
    FooterComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'manager', component: StockManagerComponent},
      {path: 'add', component: AddProductComponent},
      {path: 'getall', component: GetAllComponent},
      {path: 'modify', component: ModifyComponent},
      {path: 'foter', component: FooterComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
