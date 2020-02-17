package test.pageobjecttest;

import io.qameta.allure.*;
import org.testng.Assert;
import listener.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.service.MaxCompareService;
import pageobject.service.NavigateToService;
import java.util.concurrent.TimeUnit;
import static webdriver.WebDriverService.getDriver;

@Listeners({TestListener.class})
@Epic("Compare")
public class AddToCompareTest {
    MaxCompareService compare = new MaxCompareService();
    NavigateToService navigate = new NavigateToService();


    @BeforeMethod
    public void setUp() {
        getDriver().get("http://automationpractice.com");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
    }
    /*1. Go to catalog page
     * 2. Select List view
     * 3. Add to compare 4 items
     * 4. Get error message*/

    @Test
    @Description("Adding max elements to compare")
    @Step("Open catalog page")
    @Severity(SeverityLevel.CRITICAL)
    public void addToWishListTest() {
        navigate.toCatalogPage();
        Assert.assertEquals("You cannot add more than 3 product(s) to the product comparison", compare.addToCompareMaxError());
    }

    @AfterMethod
    public void cleanUp() {
        getDriver().close();
    }
}
