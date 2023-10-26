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
	private int questionId;
	private String questionStatement;
//	@OneToMany(
//			mappedBy = "questions",
//			cascade = CascadeType.ALL
//			)
//	@JsonManagedReference
//	List<Options> listOfOptions = new ArrayList<>();
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	private String correctOption;
	
//	int questionDuration;

	

	@ManyToOne
	@JoinColumn(referencedColumnName = "quizId",name = "quiz_id")
	@JsonBackReference
	private Quiz quiz;

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

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int questionId, String questionStatement, String option1, String option2, String option3,
			String option4, String correctOption, Quiz quiz) {
		super();
		this.questionId = questionId;
		this.questionStatement = questionStatement;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctOption = correctOption;
		this.quiz = quiz;
	}

	
	
}
