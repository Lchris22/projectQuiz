package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.OptionsLengthException;
import com.example.demo.Exception.QuestionsLengthException;
import com.example.demo.dao.QuestionsRepository;
import com.example.demo.dao.QuizRepository;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Quiz;

@Service
public class QuizService {

	@Autowired
	QuizRepository quizRepository;
	


	@Autowired
	QuestionsRepository questionsRepository;

	public Quiz getQuizById(int id) {
		Optional<Quiz> quiz1 = quizRepository.findById(id);
		Quiz oldQuiz = null;
		if (quiz1.isPresent()) {
			oldQuiz = quiz1.get();
		}
		return oldQuiz;
	}

	public List<Quiz> getQuizzes() {
		return quizRepository.findAll();
	}

	public Quiz addQuiz(Quiz q) throws Exception{
		List<Questions> questions = q.getListOfquestions();
		boolean flag = true;
		for(Questions elem : questions) {
			if(elem.getQuestionStatement().length()>500) {
				flag = false;
			}
		}
		
			if(flag) {
				int duration_per_question =q.getDuration_per_question();
				int total_no_of_question=q.getTotal_number_of_questions();
				int quiz_duration=total_no_of_question *duration_per_question;
				q.setTotal_duaration_of_quiz(quiz_duration);
				Quiz newQuiz = quizRepository.save(q);
				System.out.println("Quiz Added");
				return newQuiz;
			
		}else {
			throw new QuestionsLengthException();
		}
		
		
		
	}


}
