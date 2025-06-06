package org.valix.validators;

import org.valix.exceptions.InvalidFormatException;

import java.util.regex.Pattern;

public class Validator implements IValidator {
    @Override
    public boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) {
            throw new InvalidFormatException("Email is empty");
        }

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        return pattern.matcher(email).matches();
    }

    @Override
    public boolean isPhoneNumberValid(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new InvalidFormatException("Phone number is empty");
        }

        Pattern pattern = Pattern.compile("^\\+?[0-9]{10,13}$");
        return pattern.matcher(phoneNumber).matches();
    }
}
