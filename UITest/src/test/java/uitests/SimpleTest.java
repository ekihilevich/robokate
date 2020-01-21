package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    @Test
    public void uiTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("search_query_top"));
        element.sendKeys("casual");
        element.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
