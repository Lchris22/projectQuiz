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
   
	Topic quizTopic=Topic.JAVA;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int quizId;
	
	private String quizName;
	private int numberOfQuestions;
	private int duaration;

	@OneToMany(
			mappedBy = "quiz",
			cascade = CascadeType.ALL
			)
	@JsonManagedReference
	private List<Questions> listOfquestions = new ArrayList<>();

	public Topic getQuizTopic() {
		return quizTopic;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(Topic quizTopic, int quizId, String quizName, int numberOfQuestions, int duaration,
			List<Questions> listOfquestions) {
		super();
		this.quizTopic = quizTopic;
		this.quizId = quizId;
		this.quizName = quizName;
		this.numberOfQuestions = numberOfQuestions;
		this.duaration = duaration;
		this.listOfquestions = listOfquestions;
	}

	public void setQuizTopic(Topic quizTopic) {
		this.quizTopic = quizTopic;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getDuaration() {
		return duaration;
	}

	public void setDuaration(int duaration) {
		this.duaration = duaration;
	}

	public List<Questions> getListOfquestions() {
		return listOfquestions;
	}

	public void setListOfquestions(List<Questions> listOfquestions) {
		this.listOfquestions = listOfquestions;
	}



}
