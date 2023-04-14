package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistractionProblem {

	public static void main(String[] args) {

	

			String regex = "^.{8,}$";
			String regex1 = "^(?=.*[A-Z]).{8,}$";

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A Password: ");
			System.out.println("Enter a password having atleast one uppercase : ");
			String password = sc.nextLine();

			Pattern pattern = Pattern.compile(regex1);
			Matcher matcher = pattern.matcher(password);
			boolean result = matcher.matches();

			if (result) {
				System.out.println("You have entered a Valid Password");
			} else {
				System.out.println("Invalid Password");
			}

		}
	}


