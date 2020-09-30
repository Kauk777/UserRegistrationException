package com.bridgelabz.UserValidationTesting;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest 
{
   
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
		UserValidation validator=new UserValidation();
    	String mood = validator.analyseMood("This is sad message");
    	Assert.assertEquals("SAD", mood);	
    }
	
	@Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy()
    {
		UserValidation validator=new UserValidation();
    	String mood = validator.analyseMood("This is happy message");
    	Assert.assertEquals("HAPPY", mood);	
    }
	
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
		{
			UserValidation validator=new UserValidation();
			boolean result;
			try {
				result = validator.checkNameValidation("Kaushal");
				Assert.assertEquals(true, result);
			} catch (UserValidationException e) {
				e.printStackTrace();
			}
				
		}
	
	@Test
    public void givenFirstName_WhenNull_ShouldThrowNullException()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
		try {
			result = validator.checkNameValidation(null);
		} catch (UserValidationException e) {
			System.out.println(e.getMessage());
			System.out.println(e.exceptionType);
			Assert.assertEquals("Enter proper value", e.getMessage());
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
    		
    }
	
	@Test
    public void givenFirstName_WhenInvalid_ShouldThrowInvalidException()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
			try {
				result = validator.checkNameValidation("Kaus@shal");
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Invalid entry, First and Last name starts with cap and atleast have 3 charcters", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			}		
    }
	
	@Test
    public void givenLastName_WhenInvalid_ShouldThrowInvalidException()
    {
			UserValidation validator=new UserValidation();
			boolean result;
			try {
				result = validator.checkNameValidation("yadav");
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Invalid entry, First and Last name starts with cap and atleast have 3 charcters", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			}
				
	}
	
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
		
			try {
				result = validator.emailValidation("Kaushal@gmail.com");
				Assert.assertEquals(true, result);
			} 
	       catch (Exception e) {
			e.printStackTrace();
		}
    		
    }
	
	@Test
    public void givenEmail_WhenNull_ShouldThrowNullException()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
		try {
				result = validator.emailValidation(null);
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Enter proper value", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
	} 
	
	@Test
    public void givenEmail_WhenInvalid_ShouldThrowInvalidException()
		{
			UserValidation validator=new UserValidation();
			boolean result;
			try {
				result = validator.emailValidation("kaushal..@gmail.co.i");
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Invalid entry, Email should have mandatory parts and proper optional part i.e., mandatory.optional@mandatory.mandatory.optional", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			}
				
		}
	
	@Test
    public void givenMobile_WhenNull_ShouldThrowNullException()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
		try {
				result = validator.mobileNoValidation(null);
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Enter proper value", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
	} 
	
	@Test
    public void givenMobile_WhenInvalid_ShouldThrowInvalidException()
		{
			UserValidation validator=new UserValidation();
			boolean result;
			try {
				result = validator.mobileNoValidation("91 98013418");
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Invalid entry, Enter proper 10 digit mobile number with country code", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			}
				
		}
	
	@Test
    public void givenPassword_WhenNull_ShouldThrowNullException()
    {
		UserValidation validator=new UserValidation();
    	boolean result;
		try {
				result = validator.passwordValidation(null);
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Enter proper value", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
	} 
	
	@Test
    public void givenPassword_WhenInvalid_ShouldThrowInvalidException()
    {
			UserValidation validator=new UserValidation();
			boolean result;
			try {
				result = validator.passwordValidation("91 98013418");
			} catch (UserValidationException e) {
				System.out.println(e.getMessage());
				System.out.println(e.exceptionType);
				Assert.assertEquals("Invalid entry, Enter proper password with atleast one uppercase,digit and special character", e.getMessage());
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			}		
	}
	
}
