package com.bridgelabz.userregistrationproblem;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserregistrationProblems {
	
	

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9]+([-\\+._][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address: ");
		String data = sc.nextLine();
	public static boolean isvalidfirstName(String firstName) {
		String regex = "^[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regex);
		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static boolean isvalidlastName(String lastName) {
		String regex = "^[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public static boolean isvalidEmail(String Email) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();
		if (Email == null) {
			return false;
		}
		Matcher matcher1 = pattern.matcher(Email);
		return matcher1.matches();

	}

		if (result) {
			System.out.println("Valid Email");
		} 
		else
		{
			System.out.println("Invalid Email");
			
	

	}


	public static boolean isvalidPassword(String password) {
		String regex = "^.{8,}$";
		Pattern pattern = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}

	}
}
}
