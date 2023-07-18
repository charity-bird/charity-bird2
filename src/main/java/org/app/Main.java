package org.app;

import org.app.User.UserController;
import org.app.User.UserDataObject;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {

    // Declare dependencies
    public static UserDataObject userDataObject;
    public static UserController userController;


    public static String authenticate(String username, String password) {
        if (username.isEmpty() || username.compareTo("admin")==0) {
            return "false";
        }
        else if (username.compareTo("user")==0 && password.compareTo("password")==0) {
            return "true";
        }
        return "false";
    }


    public static void main(String[] args) {

        // Instantiate dependencies
        userDataObject = new UserDataObject();

        port(4567);

        get("/hello", (req, res) -> "Hello World");
        get("/authenticate/:username/:password", (req, res) -> authenticate(req.params(":username"), req.params(":password")));
    }
}
