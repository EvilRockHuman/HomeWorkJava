package Streams;

import java.io.Serializable;

public class Account implements Serializable {
     String username;
     String email;
     transient String password;

    public Account(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
