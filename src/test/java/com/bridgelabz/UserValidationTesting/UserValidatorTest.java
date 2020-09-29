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
}
