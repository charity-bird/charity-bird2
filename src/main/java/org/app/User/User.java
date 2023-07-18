package org.app.User;

public class User {

    String username;
    String hashedpassword;

    public User(String username, String hashedpassword) {
        this.username = username;
        this.hashedpassword = hashedpassword;
    }
    public String getUsername() {
        return username;
    }
    public String getHashedpassword() {
        return hashedpassword;
    }

}
