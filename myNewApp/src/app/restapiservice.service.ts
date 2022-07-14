import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class RESTAPIService {

  constructor(private http: HttpClient) { }


  httpOptions={
    headers: new HttpHeaders({
          'Content-Type':'application/json'
    })
  };

  postMovie(movie:any){
    let url="http://localhost:8080/movie";
    return this.http.post(url,movie,this.httpOptions);
  }

}
