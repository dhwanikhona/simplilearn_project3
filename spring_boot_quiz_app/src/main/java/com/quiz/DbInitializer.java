package com.quiz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.quiz.model.Quiz;
import com.quiz.service.QuizService;

@Component
public class DbInitializer implements CommandLineRunner{

	private QuizService service;
	private String options;
	private String question;
	
	public DbInitializer(QuizService service) {
		this.service=service;
	}
	@Override
	public void run(String... args) throws Exception {
//		this.service.deleteAll();
		
		Quiz quiz3 =new Quiz(1,"What is Spring Boot?","Spring Boot is not an open source.","Spring Boot is an open source Java-based framework.","Machine","Programming Language");
		Quiz quiz4 =new Quiz(2,"What is AngularJS","Programming Language","AngularJS is a structural framework for dynamic web apps.","Angular Js is a Machine","Tool");
		Quiz quiz5 = new Quiz(3,"What is Java Script","Machine","JavaScript is a scripting language used to create and control dynamic website content.","Machine","Java Script is a tool");
		
		this.service.saveQuiz(quiz3);
		this.service.saveQuiz(quiz4);
		this.service.saveQuiz(quiz5);
		
		System.out.print("Database has been initialized");
		
	}

}
