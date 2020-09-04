import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

books : any  ;
amount : number=5000;
  searchname:string="";

  constructor(private service:BookService) { }

  ngOnInit() {
     this.service.getBooks().subscribe((data)=>this.books=data);

  }

}
