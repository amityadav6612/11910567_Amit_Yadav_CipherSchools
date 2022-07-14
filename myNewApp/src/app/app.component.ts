
import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RESTAPIService } from './restapiservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  title = 'webApp1';
  movieid=""
  moviename=""
  moviedesc=""
 
  constructor(private service: RESTAPIService,private router: Router){}
  
  ngOnInit():void{

  }


  saveMovie(){
    let movieDetail={id:this.movieid,name:this.moviename,description:this.moviedesc};
    this.service.postMovie(movieDetail).subscribe({
      error:(err)=>{console.error(err)},
      complete:()=>{console.log('success')}
    });


  }
}
