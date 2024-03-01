package com.devlab.pages.login;

import com.devlab.models.Login;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@Getter
@NoArgsConstructor
public class LoginPage {
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton =  By.id("login-button");
}
