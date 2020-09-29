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
    	boolean result = validator.firstNameValidation("Kaushal");
    	Assert.assertEquals(true, result);	
    }
	
	@Test
    public void givenFirstName_WhenShort_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.firstNameValidation("Ka");
    	Assert.assertEquals(false, result);	
    }
	
	@Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.firstNameValidation("Ka@ushal");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.lastNameValidation("Yadav");
    	Assert.assertEquals(true,result);	
    }
	
	@Test
    public void givenLastName_WhenShort_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.lastNameValidation("Ya");
    	Assert.assertEquals(false,result);	
    }
	
	@Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.lastNameValidation("Yada%v");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.emailValidation("abc@gmail.com");
    	Assert.assertEquals(true,result);	
    }
	
	@Test
    public void givenEmail_WhenContainsOptionalPart_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.emailValidation("abc44.holy@gmail.co.in");
    	Assert.assertEquals(true,result);	
    }
	
	@Test
    public void givenEmail_WhenTwoConsecutiveDots_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.emailValidation("a..bc@gmail.com");
    	Assert.assertEquals(false,result);	
    }
	
	@Test
    public void givenEmail_WhenOptionalShort_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.emailValidation("abc.xyz@gmail.com.a");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenEmail_WhenSpecialCharTld_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.emailValidation("abc-100@gma@il.com.a");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenPhoneNo_WhenProper_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.mobileNoValidation("91 9801641805");
    	Assert.assertEquals(true,result);	
    }
	
	@Test
    public void givenPhoneNo_WhenInvalidCountryCode_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.mobileNoValidation("942 980164180");
    	Assert.assertEquals(false,result);	
    }
	
	@Test
    public void givenPhoneNo_WhenShort_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.mobileNoValidation("91 98016418");
    	Assert.assertEquals(false,result);	
    }
	
	@Test
    public void givenPhoneNo_WhenWithoutSpace_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.mobileNoValidation("919801641805");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenPhoneNo_WhenStartWithZero_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.mobileNoValidation("91 0801641805");
    	Assert.assertFalse(result);	
    }
	
	@Test
    public void givenPassword_WhenProperLength_ShouldReturnTrue()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.passwordValidation("joshua84");
    	Assert.assertEquals(true,result);	
    }
	
	@Test
    public void givenPassword_WhenNotProperLength_ShouldReturnFalse()
    {
		UserValidation validator=new UserValidation();
    	boolean result = validator.passwordValidation("jo84a");
    	Assert.assertEquals(false,result);	
    }
}
