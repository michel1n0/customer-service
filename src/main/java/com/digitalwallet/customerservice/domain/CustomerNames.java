package com.digitalwallet.customerservice.domain;

public class CustomerNames {
    private final String namesRegex = "^[A-Za-z\\p{L}'\\-\\s]+$";
    public String value;

    public CustomerNames(String value) {
        this.value = value;
        this.ensureIsValidNames(value);
    }

    private void ensureIsValidNames(String value) {
        if(!value.matches(this.namesRegex)) {
            throw new RuntimeException();
        }
    }
}
