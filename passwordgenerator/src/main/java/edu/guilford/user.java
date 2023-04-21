package edu.guilford;

public class user {

    // Attributes for the user - for logins or creation of account
    private String firstName;
    private String email;
    private String username;
    private String password;
    private String passwordConfirm;
    private String phoneNum;

    // Constructor for the user
    public user(String firstName, String email, 
        String username, String password, 
        String passwordConfirm, String phoneNum) {
        this.firstName = firstName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.phoneNum = phoneNum;
    }
}
