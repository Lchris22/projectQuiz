package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int questionId;
	String questionStatement;
	@OneToMany(
			mappedBy = "questions",
			cascade = CascadeType.ALL
			)
	@JsonManagedReference
	List<Options> listOfOptions = new ArrayList<>();
	int correctOptionIndex;
	
	int questionDuration;

	

	@ManyToOne
	@JoinColumn(referencedColumnName = "quizId",name = "quiz_id")
	@JsonBackReference
	private Quiz quiz;

	public Questions() {
		super();
	}



	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionStatement() {
		return questionStatement;
	}

	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}

	public List<Options> getListOfOptions() {
		return listOfOptions;
	}

	public void setListOfOptions(List<Options> listOfOptions) {
		this.listOfOptions = listOfOptions;
	}

	public int getCorrectOptionIndex() {
		return correctOptionIndex;
	}

	public void setCorrectOptionIndex(int correctOptionIndex) {
		this.correctOptionIndex = correctOptionIndex;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	public int getQuestionDuration() {
		return questionDuration;
	}

	public void setQuestionDuration(int questionDuration) {
		this.questionDuration = questionDuration;
	}
}
