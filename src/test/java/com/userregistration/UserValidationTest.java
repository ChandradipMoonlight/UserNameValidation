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
    public void givenFirstName_LastNameWhenProperShouldReturnTrue() {
        boolean fNameResult = validation.validateName("Chandradip");
        boolean lNameResult = validation.validateName("Shivankar");
        Assertions.assertTrue(fNameResult);
        Assertions.assertTrue(lNameResult);
    }
    @Test
    public void givenMobileNumberWhenProperShouldReturnTrue() {
        boolean mobileNumber = validation.validateMobileNumber("91 9145388092");
        Assertions.assertTrue(mobileNumber);
    }
    @Test
    public void givenPasswordWhenProperShouldReturnTrue() {
        boolean userPassword = validation.validatePassword("MoonLight@143");
        Assertions.assertTrue(userPassword);
    }
    @Test
    public void givenPasswordShouldReturnValidPassword() {
        String userPass = validation.validatePass("Dipak@124");
        System.out.println(userPass);
        Assertions.assertEquals(userPass, "Valid Password.");
    }
    @Test
    public void givenNullShouldReturnPleaseEnteredValidPassword() {
        String userPass = validation.validatePass(null);
        System.out.println(userPass);
        Assertions.assertEquals(userPass, "Please entered valid password");
    }

    @DisplayName("Test case to validate all 24 email addresses by using parameterized test")
    @ParameterizedTest

    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com", "abc@gmail.com.com",
            "abc+100@gmail.com", "abc","abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})

    public void givenEmailWhenProperShouldReturnTrue(String emailId) {
        boolean emailAddress = validation.validateEmail(emailId);
        Assertions.assertTrue(emailAddress);
    }

}
