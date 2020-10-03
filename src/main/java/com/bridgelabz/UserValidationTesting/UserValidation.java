package com.bridgelabz.UserValidationTesting;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@FunctionalInterface
interface CheckValidation {
	boolean validation(String str) throws UserValidationException;
}

public class UserValidation {
	
	private static final Pattern CHECK_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})(\\.?[a-zA-Z]{2,})?$");
	private static final Pattern MOBILE_PATTERN=Pattern.compile("^[0-9]{2}\\s{1}[6-9]{1}[0-9]{9}$");
	private static final Pattern PASSWORD_PATTERN=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&-+_=]{1}).{8,}$");
	
	public void printMessage() {
		System.out.println("Welcome to user validation testing");
	}
	
	public String analyseMood(String mood) {
		if(mood.contains("sad"))
		return "SAD";
		else
		return "HAPPY";	
	}
	
	CheckValidation checkNullEmpty=(data) -> {
		try {
			if(data.length()==0)
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY,"Enter proper value");
		}catch(NullPointerException e) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL,"Enter proper value");
		}
		return true;
	};
	
	public boolean checkNameValidation(String name) throws UserValidationException {
		checkNullEmpty.validation(name);
		Predicate<String> valid= na-> CHECK_NAME.matcher(na).matches();
		if(!(valid.test(name))) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, First and Last name starts with cap and atleast have 3 charcters");
		}
		return valid.test(name);
	}
	
	public boolean emailValidation(String email) throws UserValidationException {
		checkNullEmpty.validation(email);
		Predicate<String> valid= na-> EMAIL_PATTERN.matcher(na).matches();
		if(!(valid.test(email))) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Email should have mandatory parts and proper optional part i.e., mandatory.optional@mandatory.mandatory.optional");
		}
		return valid.test(email);
	}
	
	public boolean mobileNoValidation(String phno) throws UserValidationException {
		checkNullEmpty.validation(phno);
		Predicate<String> valid= na-> MOBILE_PATTERN.matcher(na).matches();
		if(!(valid.test(phno))) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Enter proper 10 digit mobile number with country code");
		}
		return valid.test(phno);
	}
	
	public boolean passwordValidation(String psswd) throws UserValidationException {
		checkNullEmpty.validation(psswd);
		Predicate<String> valid= na-> PASSWORD_PATTERN.matcher(na).matches();
		if(!(valid.test(psswd))) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Enter proper password with atleast one uppercase,digit and special character");
		}
		return valid.test(psswd);
	}

}
