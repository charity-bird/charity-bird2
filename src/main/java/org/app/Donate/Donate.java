package org.app.Donate;

import lombok.Value;

@Value
public class Donate {
    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;
    String postalCode;
    int amount;

    public Donate(String firstName, String lastName, String emailAddress, String phoneNumber, String postalCode, int amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.amount = amount;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public int getAmount() {
        return amount;
    }
}
