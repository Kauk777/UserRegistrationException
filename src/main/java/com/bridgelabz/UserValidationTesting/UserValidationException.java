package com.bridgelabz.UserValidationTesting;

public class UserValidationException extends Exception {
	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY,ENTERED_INVALID
	}
	
	ExceptionType exceptionType;

	public UserValidationException(ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType=exceptionType;
	}

}
