package pageobject.base;

import org.openqa.selenium.WebDriver;
import pageobject.component.Header;
import pageobject.page.HomePage;
import webdriver.WebDriverService;

public class BasePage {
    protected Header header;
    protected WebDriver driver;

    public BasePage() {
        driver = WebDriverService.getDriver();
        header = new Header();
    }

    public HomePage openHomePage() {
        return header.clickLogo();
    }
}
