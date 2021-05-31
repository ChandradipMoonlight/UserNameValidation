package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    UserValidation validation = new UserValidation();
    @Test
    public void givenFirstName_LastNameWhenProperShouldReturnTrue() {
        boolean fNameResult = validation.validateName("Chandradip");
        boolean lNameResult = validation.validateName("Shivankar");
        Assertions.assertTrue(fNameResult);
        Assertions.assertTrue(lNameResult);
    }
    @Test
    public void givenEmailWhenProperShouldReturnTrue() {
        boolean emailAddress = validation.validateEmail("chandradip96@gmail.com");
        Assertions.assertTrue(emailAddress);
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
}
