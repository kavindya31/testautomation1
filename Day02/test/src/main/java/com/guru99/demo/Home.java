package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    //WebDriver driver = new ChromeDriver();

    public void clickOnRegisterMenu(WebDriver driver) {
        waitUntilNextElement(driver,By.xpath("//a[text()='REGISTER']"), 5);
        WebElement register = driver.findElement(By.xpath("//a[text()='REGISTER']"));
        register.click();
    }

    private void waitUntilNextElement(WebDriver driver, By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


}
