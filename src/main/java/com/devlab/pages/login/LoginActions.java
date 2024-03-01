package com.devlab.pages.login;

import com.devlab.core.UIHandler;
import com.devlab.models.Login;

public class LoginActions {

    private static final LoginPage LOGIN_PAGE = new LoginPage();

    public static void login(Login login) {
        UIHandler.type(LOGIN_PAGE.getUsername(), login.getUsername());
        UIHandler.type(LOGIN_PAGE.getPassword(), login.getPassword());
        UIHandler.click(LOGIN_PAGE.getLoginButton());
    }
}
