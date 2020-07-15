import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Quiz } from './quiz';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  private url:string;
  constructor(private http:HttpClient) {
    this.url="http://localhost:9100/quiz"
   }

   public getAllQuiz():Observable<Quiz[]>{
    return this.http.get<Quiz[]>(this.url+"zes");
  }

}