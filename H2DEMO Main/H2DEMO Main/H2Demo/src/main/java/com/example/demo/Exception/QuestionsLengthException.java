package com.example.demo.Exception;

public class QuestionsLengthException extends Exception{
	
	public QuestionsLengthException(){
		super("No of Questions are greater than 20");
	}

}
