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
	
	CheckValidation checkNameValidation=(String name) -> {
		checkNullEmpty.validation(name);
		boolean valid=  CHECK_NAME.matcher(name).matches();
		if(!valid) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, First and Last name starts with cap and atleast have 3 charcters");
		}
		return valid;
	};
	
	CheckValidation emailValidation=(String email) -> {
		checkNullEmpty.validation(email);
		boolean valid= EMAIL_PATTERN.matcher(email).matches();
		if(!valid) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Email should have mandatory parts and proper optional part i.e., mandatory.optional@mandatory.mandatory.optional");
		}
		return valid;
	};
	
	CheckValidation mobileNoValidation=(String phno) -> {
		checkNullEmpty.validation(phno);
		boolean valid= MOBILE_PATTERN.matcher(phno).matches();
		if(!valid) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Enter proper 10 digit mobile number with country code");
		}
		return valid;
	};
	
	CheckValidation passwordValidation=(String psswd) -> {
		checkNullEmpty.validation(psswd);
		boolean valid=  PASSWORD_PATTERN.matcher(psswd).matches();
		if(!valid) {
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_INVALID,"Invalid entry, Enter proper password with atleast one uppercase,digit and special character");
		}
		return valid;
	};

}
