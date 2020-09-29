package com.bridgelabz.UserValidationTesting;

import java.util.regex.Pattern;

public class UserValidation {
	
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern LAST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})(\\.?[a-zA-Z]{2,})?$");
	
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
	
	public boolean lastNameValidation(String lname) {
		return LAST_NAME.matcher(lname).matches();
	}
	
	public boolean emailValidation(String email ) {
		return EMAIL_PATTERN.matcher(email).matches();
	}

}
