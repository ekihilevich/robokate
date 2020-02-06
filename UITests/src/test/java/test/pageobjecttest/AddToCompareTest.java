package test.pageobjecttest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.component.Header;
import pageobject.page.CatalogPage;

import java.util.concurrent.TimeUnit;

import static webdriver.WebDriverService.getDriver;

public class AddToCompareTest {

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
    public void addToWishListTest() {
        CatalogPage catalogPage = new Header().clickWomen();
        catalogPage.waitListView();
        catalogPage.listView();
        catalogPage.addToCompare(2);
        catalogPage.waitAddToCompare(1);
        catalogPage.addToCompare(3);
        catalogPage.waitAddToCompare(2);
        catalogPage.addToCompare(4);
        catalogPage.waitAddToCompare(3);
        catalogPage.addToCompare(0);
        catalogPage.waitAlertText();
        Assert.assertEquals("You cannot add more than 3 product(s) to the product comparison", catalogPage.getAlertText());
    }

    @AfterMethod
    public void cleanUp() {
        getDriver().close();
    }
}
