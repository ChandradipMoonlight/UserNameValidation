package com.usernamevalidation;

import java.util.Scanner;
import java.util.regex.*;

public class UserNameValidation {
	public static boolean isValidFirstName(String name) {
		String regexFirstName = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regexFirstName);
		if (name == null) {
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();
			 
		 }
	
	public static void main(String[] args) {
		System.out.println("Welcome to the username validation program.");
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Plase enter the your First Name: ");
		String firstName = input.nextLine();	 
	    System.out.println(isValidFirstName(firstName));
	        
	    System.out.print("Plase enter the your last Name: ");
	    String lastName = input.nextLine();		 
		System.out.println(isValidFirstName(lastName));
	}
	
}
