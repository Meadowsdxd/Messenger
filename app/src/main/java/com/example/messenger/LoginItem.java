package com.example.messenger;

public class LoginItem {
    private String login;
    private String password;
    private boolean loggedin;

    public LoginItem(String login, String password, boolean loggedin) {
        this.login = login;
        this.password = password;
        this.loggedin = loggedin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedin() {
        return loggedin;
    }

    public void setLoggedin(boolean loggedin) {
        this.loggedin = loggedin;
    }
}
