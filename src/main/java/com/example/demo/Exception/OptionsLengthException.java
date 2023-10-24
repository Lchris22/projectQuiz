package com.example.demo.Exception;

public class OptionsLengthException extends Exception{

	public OptionsLengthException() {
		super("More than four options or Question length is greater than 500 characters");
	}
}
