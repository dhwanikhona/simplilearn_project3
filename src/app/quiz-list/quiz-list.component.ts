import { Component, OnInit } from '@angular/core';
import { QuizService } from '../quiz.service';
import { Quiz } from '../quiz';


@Component({
  selector: 'app-quiz-list',
  templateUrl: './quiz-list.component.html',
  styleUrls: ['./quiz-list.component.css']
})
export class QuizListComponent implements OnInit {

  private quiz:Quiz[];
  constructor(private service:QuizService) { }

  

    ngOnInit() {
  this.service.getAllQuiz().subscribe(res=>{
    this.quiz=res});
  }

}

