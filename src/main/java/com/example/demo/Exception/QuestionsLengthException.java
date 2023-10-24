package com.example.demo.Exception;

public class QuestionsLengthException extends Exception{
	
	public QuestionsLengthException(){
		super("Questions Length is greater than 20");
	}

}
