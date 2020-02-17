package pageobject.page;

import pageobject.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private static final String EMAIL_FIELD_BY = "[id='email']";
    private static final String PASSWORD_FIELD_BY = "[id='passwd']";
    private static final String SIGN_IN_BUTTON_BY = "[id='SubmitLogin']";

    public void enterEmail(String email) {
        $(EMAIL_FIELD_BY).setValue(email);
    }

    public void enterPassword(String password) {
        $(PASSWORD_FIELD_BY).sendKeys(password);
    }

    public ProfilePage signIn() {
        $(SIGN_IN_BUTTON_BY).click();
        return new ProfilePage();
    }
}
