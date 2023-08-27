package com.digitalwallet.customerservice.domain;

public class Customer {
    private CustomerNames givenNames;
    private CustomerNames surnames;

    public Customer(String givenNames, String surnames) {
        this.givenNames = new CustomerNames(givenNames);
        this.surnames = new CustomerNames(surnames);
    }
}
