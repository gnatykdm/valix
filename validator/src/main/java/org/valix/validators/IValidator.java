package org.valix.validators;

public interface IValidator {
    boolean isEmailValid(String email);
    boolean isPhoneNumberValid(String phoneNumber);
}
