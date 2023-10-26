package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
   
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int quizId;
	
	
	private String quizName;
	private int total_number_of_questions;
	private String quizTopic="Java Core";
	private String quiz_status;
	private int total_duaration_of_quiz;
	private int duration_per_question;
	
	

	@OneToMany(
			mappedBy = "quiz",
			cascade = CascadeType.ALL
			)
	@JsonManagedReference
	private List<Questions> listOfquestions = new ArrayList<>();



	public int getQuizId() {
		return quizId;
	}



	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}



	public String getQuizTopic() {
		return quizTopic;
	}



	public void setQuizTopic(String quizTopic) {
		this.quizTopic = quizTopic;
	}



	public String getQuizName() {
		return quizName;
	}



	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}



	public int getTotal_number_of_questions() {
		return total_number_of_questions;
	}



	public void setTotal_number_of_questions(int total_number_of_questions) {
		this.total_number_of_questions = total_number_of_questions;
	}



	public String getQuiz_status() {
		return quiz_status;
	}



	public void setQuiz_status(String quiz_status) {
		this.quiz_status = quiz_status;
	}



	public int getTotal_duaration_of_quiz() {
		return total_duaration_of_quiz;
	}



	public void setTotal_duaration_of_quiz(int total_duaration_of_quiz) {
		this.total_duaration_of_quiz = total_duaration_of_quiz;
	}



	public int getDuration_per_question() {
		return duration_per_question;
	}



	public void setDuration_per_question(int duration_per_question) {
		this.duration_per_question = duration_per_question;
	}



	public List<Questions> getListOfquestions() {
		return listOfquestions;
	}



	public void setListOfquestions(List<Questions> listOfquestions) {
		this.listOfquestions = listOfquestions;
	}



	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Quiz(int quizId, String quizTopic, String quizName, int total_number_of_questions, String quiz_status,
			int total_duaration_of_quiz, int duration_per_question, List<Questions> listOfquestions) {
		super();
		this.quizId = quizId;
		this.quizTopic = quizTopic;
		this.quizName = quizName;
		this.total_number_of_questions = total_number_of_questions;
		this.quiz_status = quiz_status;
		this.total_duaration_of_quiz = total_duaration_of_quiz;
		this.duration_per_question = duration_per_question;
		this.listOfquestions = listOfquestions;
	}

	
	

}
