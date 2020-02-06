package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class AddToCardTest {

    WebDriver driver = new ChromeDriver();

    @AfterTest
    public void afterTest() {
        driver.close();
    }

    @Test
    public void uiTest() {

        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@title='Women']")).click();
        driver.findElement(By.xpath(" //i[@class='icon-th-list']")).click();
        driver.findElement(By.xpath("//div[@class='compare']//a[@data-id-product='1']|add_to_compare")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='compare']//a[@data-id-product='1']|add_to_compare")));
//                    visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
        driver.findElement(By.xpath("//div[@class='compare']//a[@data-id-product='5']|add_to_compare")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium bt_compare bt_compare']")).click();
        driver.findElement(By.xpath("//div[@class='button-container']//a[@data-id-product='1']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

