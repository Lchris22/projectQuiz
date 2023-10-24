package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Quiz;
import com.example.demo.service.QuizService;

@RestController
public class HomeController {
	
	@GetMapping(path = "/")
	public String hello() {
		return "Hello World";
	}
	

	@Autowired
	private QuizService quizService;

	@GetMapping("/getquiz/{id}")
	public Quiz getQuizById(@PathVariable int id) {
		return quizService.getQuizById(id);
	}

	@GetMapping("/getquiz")
	public List<Quiz> getQuizzes() {
		return quizService.getQuizzes();
	}

	@PostMapping("/addQuiz")
	public Quiz addQuiz(@RequestBody Quiz q1) {
		System.out.println("Adding Quiz");
//		System.out.println(q1);
		try {
			return quizService.addQuiz(q1);
		}catch(Exception e) {
			System.out.println(e);
		}
		return new Quiz();
	}


}
