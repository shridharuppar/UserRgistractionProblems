package com.bridgelabz.userregistrationproblem;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationProblemTest {
	public boolean isValidFirstName(String firstName) {
		// code to validate first name
		return true; // replace with actual validation logic
	}

	@Test
	public void testValidFirstName() {
		UserRegistrationProblemTest userRegistrationProblemTest = new UserRegistrationProblemTest();
		boolean result = userRegistrationProblemTest.isValidFirstName("shridhar");
		Assert.assertEquals(true, result);
	
}

}