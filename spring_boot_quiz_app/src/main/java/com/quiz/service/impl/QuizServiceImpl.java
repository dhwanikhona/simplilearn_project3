package com.quiz.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizDAO;
import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;
import com.quiz.service.QuizService;
@Service
public class QuizServiceImpl implements QuizService {
	@Autowired
	private QuizDAO dao;
	private Quiz quiz;

	@Override
	public Quiz saveQuiz(Quiz quiz) {
		
		return dao.save(quiz);
	}

	@Override
	public Quiz getQuizById(int id) throws BusinessException {
		
		if(id<=0) {
			throw new BusinessException("Id "+id +" is invalid");
		}
		Quiz quiz=null;
		try {
		quiz=dao.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new BusinessException("No quiz found for id "+id);
		}
		return quiz;
	}

	@Override
	public List<Quiz> getAllQuiz() {
		
		return dao.findAll();
	}

	}
