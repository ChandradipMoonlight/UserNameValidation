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
	public static boolean isValidEmail(String email) {

		String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
		Pattern p = Pattern.compile(regexEmail);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	public static boolean isValidMobileNum(String mobileNum) {
		String regexMobileNum = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regexMobileNum);
		if ( mobileNum == null ){
			return false;
		}
		Matcher m = p.matcher(mobileNum);
		
		return m.matches();
	}
	public static boolean isValidPassword(String password) {
		String regexPassword = "^[a-z A-z]{8,}$";
		Pattern p = Pattern.compile(regexPassword);
		if ( password == null ){
			return false;
		}
		Matcher m = p.matcher(password);
		
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
		
		System.out.print("Plase enter the your Email ID: ");
	    String emailID = input.nextLine();		 
		System.out.println(isValidEmail(emailID));
		
		System.out.print("Plase enter the your mobile with counry code 91: ");
	    String mobileNo = input.nextLine();		 
		System.out.println(isValidMobileNum(mobileNo));
		
		
		System.out.print("please enter the password: ");
		String userPassword = input.nextLine();
		System.out.println(isValidPassword(userPassword));
	}
	
}
