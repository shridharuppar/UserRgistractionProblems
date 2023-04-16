package com.bridgelabz.userregistrationproblem;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserregistrationProblems {
	
	

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9]+([-\\+._][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";

		String regex1 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password having atleast 1 uppercase, 1 number & 1 special character  : ");
		String password = sc.nextLine();
		System.out.println("Enter Email Address: ");
		String data = sc.nextLine();

		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(password);
		Matcher matcher1 = pattern.matcher(data);
		boolean result = matcher1.matches();

		if (result) {
			System.out.println("You have entered a Valid Password");
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Password");
			System.out.println("Invalid Email");
		}

	}}
