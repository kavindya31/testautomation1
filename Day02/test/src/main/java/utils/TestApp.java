package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestApp {

    private WebDriver driver;
    private static TestApp myObj;
    PropertyFileReader property = new PropertyFileReader();

    public static TestApp getInstance() {
        if (myObj == null) {
            myObj = new TestApp();
        }
        return myObj;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void navigateToURL() {
        String url = property.getProperty("config", "url");
        driver.get(url);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebElement waitUntilNextElementAppears(By locator, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}