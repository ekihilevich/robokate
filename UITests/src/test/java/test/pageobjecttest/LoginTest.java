package test.pageobjecttest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.service.LoginService;
import pageobject.service.NavigateToService;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    NavigateToService navigate = new NavigateToService();
    LoginService login = new LoginService();

    @BeforeMethod
    public void setUp() {
        browser = "chrome";
        headless = false;
        browserSize = "1024x768";
    }

    @Test
    public void LoginSuccess() {
        open("http://automationpractice.com");
        navigate.toLoginPage();
        Assert.assertEquals(login.login("katsiaruna@mail.ru", "123456"), "My account - My Store");
    }

}
