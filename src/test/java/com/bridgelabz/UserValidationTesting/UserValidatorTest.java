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
}
