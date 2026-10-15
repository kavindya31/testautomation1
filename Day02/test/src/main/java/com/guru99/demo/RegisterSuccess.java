package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSuccess {

    public String getSalutationMessage(WebDriver driver) {
        waitUntilNextElement(driver,By.xpath("//*[contains(text(),'Dear')]"),10);
        WebElement salutationMessageElement =
                driver.findElement(By.xpath("//*[contains(text(),'Dear')]"));

        return salutationMessageElement.getText();
    }

    private void waitUntilNextElement(WebDriver driver, By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}