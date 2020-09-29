package com.bridgelabz.UserValidationTesting;

import java.util.regex.Pattern;

public class UserValidation {
	
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	
	public void printMessage() {
		System.out.println("Welcome to user validation testing");
	}
	
	public String analyseMood(String mood) {
		if(mood.contains("sad"))
		return "SAD";
		else
		return "HAPPY";	
	}
	
	public boolean firstNameValidation(String fname) {
		return FIRST_NAME.matcher(fname).matches();
	}

}
