package pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.base.BasePage;
import webdriver.WebDriverService;

import java.util.List;

public class CatalogPage extends BasePage {

    private static final By ADD_TO_COMPARE_BY = By.xpath("//a[@class='add_to_compare']");
    private static final By ADD_TO_CART_BY = By.cssSelector("[title='Add to cart']");
    private static final By ADD_TO_WISH_LIST__BY = By.xpath("//a[@class='addToWishlist wishlistProd_1']");
    private static final By LIST_VIEW_BY = By.xpath("//i[@class='icon-th-list']");
    private static final By GRID_VIEW_BY = By.xpath("//i[@class='icon-th-large']");
    private static final By GO_TO_COMPARE_BY = By.xpath("//strong[@class='total-compare-val']");
    private static final By ALERT_BY = By.xpath("//p[@class='fancybox-error']");


    public void addToCompare() {
        List<WebElement> toCompare = driver.findElements(ADD_TO_COMPARE_BY);
        toCompare.get(0).click();
    }

    public void waitAddToCompare(int i) {
        WebDriverWait wait = new WebDriverWait(WebDriverService.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format("//strong[@class='total-compare-val'][text()='%S']", i))));
    }

    public ComparePage goToCompare() {
        driver.findElement(GO_TO_COMPARE_BY).click();
        return new ComparePage();
    }

    public void addToWishList(int i) {

        List<WebElement> toWishList = driver.findElements(ADD_TO_WISH_LIST__BY);
        toWishList.get(i).click();
    }

    public void addToCart(int i) {
        List<WebElement> toCart = driver.findElements(ADD_TO_CART_BY);
        toCart.get(i).click();
    }

    public void waitListView() {
        WebDriverWait wait = new WebDriverWait(WebDriverService.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LIST_VIEW_BY));
    }

    public void listView() {
        driver.findElement(LIST_VIEW_BY).click();
    }

    public void gridView() {
        driver.findElement(GRID_VIEW_BY).click();
    }

    public String getAlertText() {
        return driver.findElement(ALERT_BY).getText();
    }

    public void waitAlertText() {
        WebDriverWait wait = new WebDriverWait(WebDriverService.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALERT_BY));

    }
}
