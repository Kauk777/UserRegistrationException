package com.bridgelabz.UserValidationTesting;

public class UserValidation {
	
	public void printMessage() {
		System.out.println("Welcome to user validation testing");
	}
	public String analyseMood(String mood) {
		if(mood.contains("sad"))
		return "SAD";
		else
		return "HAPPY";	
	}

}
