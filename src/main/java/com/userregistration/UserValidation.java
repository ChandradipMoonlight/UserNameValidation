package com.userregistration;

import java.util.regex.Pattern;

public class UserValidation {
    /* Declaration of constants for regex pattern */

    // regex pattern for first name and last name
    private static final String NAME_PATTERN = "^[A-Z][a-z A-Z]{2,}$";
    // regex pattern for email
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
    // regex pattern for mobile number
    private static final String MOBILE_PATTERN = "^[9][1]\\s[6-9][0-9]{9}$";
    // regex pattern for password
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";

    // Method to validate first name and las t name
    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(name).matches();
    }
    // Method to validate user email address
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    // Method to validate user mobile number.
    public boolean validateMobileNumber(String mobileNum) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobileNum).matches();
    }
    // Method to validate user password.
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
    // Method handle NullPointer exception
    public String validatePass(String pass) {
        String validPassword = "Valid Password.";
        String invalidPassword = "Invalid Password";
        try {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            if (!pattern.matcher(pass).matches()) {
                return invalidPassword;
            } else {
                return validPassword;
            }
        } catch (NullPointerException exception){
            return "Please entered valid password";
        }
    }
}
