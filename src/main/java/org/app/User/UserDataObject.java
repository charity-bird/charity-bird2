package org.app.User;

import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.List;

public class UserDataObject {

    public final User[] users = {
            new User("admin", "admin"),
            new User("user", "user")
    };

    public User getUserByUsername(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public String getPassword(String username){
        return getUserByUsername(username).getHashedpassword();
    }

    public String[] getUsernames(){
        String[] usernames = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            usernames[i] = users[i].getUsername();
        }
        return usernames;
    }

}
