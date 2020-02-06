package pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.page.CartPage;
import pageobject.page.CatalogPage;
import pageobject.page.HomePage;
import webdriver.WebDriverService;

public class Header {

    private WebDriver driver;
    private static final By LOGO_BY = By.cssSelector("[alt='My Store']");
    private static final By WOMEN_BY = By.xpath("//a[@title='Women']");
    private static final By CART_BY = By.xpath("[title='View my shopping cart']");


    public Header() {
        driver = WebDriverService.getDriver();
    }

    public HomePage clickLogo() {
        driver.findElement(LOGO_BY).click();
        return new HomePage();
    }

    public CatalogPage clickWomen() {
        driver.findElement(WOMEN_BY).click();
        return new CatalogPage();
    }

    public CartPage goToCart() {
        driver.findElement(CART_BY).click();
        return new CartPage();
    }
}
