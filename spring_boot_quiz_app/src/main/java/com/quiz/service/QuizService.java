package com.quiz.service;

import java.util.List;

import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;


public interface QuizService {

	public Quiz saveQuiz(Quiz quiz);
	public Quiz getQuizById(int id) throws BusinessException;
	public List<Quiz> getAllQuiz();
	
}
