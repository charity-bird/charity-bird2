package org.app.User;

import static org.app.Main.userDataObject;
public class UserController {

    public static boolean authenticate(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        User user = userDataObject.getUserByUsername(username);
        if (user == null) {
            return false;
        }
        return user.getHashedpassword().equals(password);
    }





}
