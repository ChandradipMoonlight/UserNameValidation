package com.userregistration;

import java.util.regex.Pattern;

public class UserValidation {
    /* Declaration of constants for regex pattern */

    // regex pattern for first name and last name
    private static final String NAME_PATTERN = "^[A-Z][a-z A-Z]{2,}$";
    // regex pattern for email
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*" +
                                                "@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
    // regex pattern for mobile number
    private static final String MOBILE_PATTERN = "^[9][1]\\s[6-9][0-9]{9}$";
    // regex pattern for password
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*" +
                                                     "[@#$%^&-+=()]).{8,}$";

    // Method to validate first name and las t name
    public String validateName(String name) throws UserValidationException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        try {
            if (name.length() == 0) {
                throw new UserValidationException("Please Entered the valid name");
            }
            if (pattern.matcher(name).matches()){
                return "Valid Name";
            } else {
                return "Invalid Name";
            }
        } catch (NullPointerException exception) {
            throw new UserValidationException("Please Entered Valid Name");
        }
    }
    // Method to validate user mobile number.
    public String  validateMobileNumber(String mobileNum) throws UserValidationException {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        try {
         if (pattern.matcher(mobileNum).matches()) {
             return "Valid mobile number.";
         } else {
             throw new UserValidationException("Please entered the valid mobile number");
         }
        } catch (NullPointerException exception) {
            throw new UserValidationException("Please entered the valid mobile number address");
        }
    }
    // Method validate password
    public String validatePass(String pass) throws UserValidationException {
        try {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            if (!pattern.matcher(pass).matches()) {
                throw new UserValidationException("Please enter the correct password");
            } else {
                return "Valid password";
            }
        } catch (NullPointerException exception){
            throw new UserValidationException("Please enter the correct password");
        }
    }
    // Method to validate user email address
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
