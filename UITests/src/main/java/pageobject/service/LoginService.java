package pageobject.service;

import com.codeborne.selenide.Selenide;
import pageobject.page.LoginPage;


public class LoginService {

    public String login(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail(login);
        loginPage.enterPassword(password);
        loginPage.signIn();
        return Selenide.title();
    }
}
