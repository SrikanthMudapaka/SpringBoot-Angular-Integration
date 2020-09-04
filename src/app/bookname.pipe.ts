import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'bookname'
})
export class BooknamePipe implements PipeTransform {

  transform(value: any, sName : any): any {
    if(sName==""){
      console.log("******************* " +value.name)
      return value;
    }
    const bookarray:any[]=[];
    for(let i=0; i<=value.length-1; i++ ){
      let booknames:string=value[i].name;
      if(booknames.startsWith(sName)){
        bookarray.push(value[i]);
      }
    }
    return bookarray;
  }

}
