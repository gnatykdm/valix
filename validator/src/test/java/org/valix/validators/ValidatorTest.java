package org.valix.validators;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    IValidator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void isEmailValid() {
        final String email = "example@example.com";
        assertTrue(validator.isEmailValid(email));
    }

    @Test
    public void isEmailInvalid() {
        final String email = "example.com";
        assertFalse(validator.isEmailValid(email));
    }

    @Test
    public void isEmailEmpty() {
        final String email = "";
        assertFalse(validator.isEmailValid(email));
    }

    @Test
    public void isPhoneNumberValid() {
        final String phoneNumber = "+46700000000";
        assertTrue(validator.isPhoneNumberValid(phoneNumber));
    }

    @Test
    public void isPhoneNumberInvalid() {
        final String phoneNumber = "700000000";
        assertFalse(validator.isPhoneNumberValid(phoneNumber));
    }

    @Test
    public void isPhoneNumberEmpty() {
        final String phoneNumber = "";
        assertFalse(validator.isPhoneNumberValid(phoneNumber));
    }
}