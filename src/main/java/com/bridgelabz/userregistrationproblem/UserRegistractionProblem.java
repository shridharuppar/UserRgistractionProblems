package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistractionProblem {

	
	public boolean isValidFirstName(String firstName) {
		String regex = "^[A-Z][a-zA-Z]{2,}$";

		Pattern pattern = Pattern.compile(regex);

		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
}
