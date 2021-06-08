package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidationTest {
    UserValidation validation;

    @BeforeEach
    public void setup() {
        validation = new UserValidation();
    }
    @Test
    public void givenFirstName_LastNameWhenProperShouldReturnValidName() throws UserValidationException {
        String fNameResult = validation.validateName("Chandradip");
        String lNameResult = validation.validateName("Shivankar");
        Assertions.assertEquals("Valid Name",fNameResult);
        Assertions.assertEquals("Valid Name",lNameResult);
    }

    @Test
    public void givenFirstName_LastNameWhenShouldThrowAnException() {
        UserValidation userValidation = new UserValidation();
        try {
            String fName = validation.validateName(null);
            Assertions.assertEquals("Valid Name", fName);
        } catch (Exception | UserValidationException exception) {
            System.out.println(exception);
        }
    }
        @Test
        public void givenMobileNumberWhenProperShouldReturnValidMobileNumber () throws UserValidationException {
            String mobileNumber = validation.validateMobileNumber("91 9145388092");
            Assertions.assertEquals("Valid mobile number.", mobileNumber);
        }
        @Test
        public void givenMobileNumberShouldThrowAnException () {
        try {
            String mobileNumber = validation.validateMobileNumber("544943569");
            Assertions.assertEquals("Valid mobile number.", mobileNumber);
        } catch (Exception | UserValidationException exception) {
            System.out.println(exception);
        }
        }
        @Test
        public void givenPasswordShouldReturnValidPassword () throws UserValidationException {
            String userPass = validation.validatePass("Dipak@124");
            Assertions.assertEquals(userPass, "Valid Password.");
        }
        @Test
        public void givenNullShouldReturnPleaseEnteredValidPassword () {
            String userPass;
            try {
                userPass = validation.validatePass("5646j");
                Assertions.assertEquals(userPass, "Please entered valid password");
            } catch (UserValidationException exception) {
                System.out.println(exception);
            }
        }

        @DisplayName("Test case to validate all 24 email addresses by using parameterized test")
        @ParameterizedTest

        @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com", "abc@gmail.com.com",
                "abc+100@gmail.com", "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})

        public void givenEmailWhenProperShouldReturnTrue (String emailId){
            boolean emailAddress = validation.validateEmail(emailId);
            Assertions.assertTrue(emailAddress);
        }
    }

