package com.bridgelabz.UserValidationTesting;

import java.util.regex.Pattern;

public class UserValidation {
	
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern LAST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})(\\.?[a-zA-Z]{2,})?$");
	private static final Pattern MOBILE_PATTERN=Pattern.compile("^[0-9]{2}\\s{1}[6-9]{1}[0-9]{9}$");
	private static final Pattern PASSWORD_PATTERN=Pattern.compile("^[0-9a-zA-Z]{8,}$");
	
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
	
	public boolean mobileNoValidation(String phno) {
		return MOBILE_PATTERN.matcher(phno).matches();
	}
	
	public boolean passwordValidation(String psswd ) {
		return PASSWORD_PATTERN.matcher(psswd).matches();
	}

}
