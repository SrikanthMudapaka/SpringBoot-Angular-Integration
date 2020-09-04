import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { BooksComponent } from './books/books.component';
import { HttpClientModule } from '@angular/common/http';
import { BookService } from './book.service';
import { BooknamePipe } from './bookname.pipe';


@NgModule({
  declarations: [
    AppComponent,
    BooksComponent,
    BooknamePipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule, 
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
