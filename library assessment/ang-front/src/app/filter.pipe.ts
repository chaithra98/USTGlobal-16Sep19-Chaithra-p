import { Pipe, PipeTransform } from '@angular/core';
import { Librarian } from './studentdata/librarian';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {
    transform(student: Librarian[], search: string): Librarian[] {
      if(search===undefined){
        return student;
      }else {
        return student.filter((value , index, String)=>{
          return value.fname.toLowerCase().includes(search.toLowerCase());
        })
      }
      return null;
    }
  
  }
