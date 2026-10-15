package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Register {

    public void setFirstName(WebDriver driver, String firstNameValue) {
        waitUntilNextElement(driver, By.name("firstName"), 15);
        driver.findElement(By.name("firstName"))
                .sendKeys(firstNameValue);
    }

    public void setLastName(WebDriver driver, String lastNameValue) {
        waitUntilNextElement(driver, By.name("lastName"), 15);
        driver.findElement(By.name("lastName"))
                .sendKeys(lastNameValue);
    }

    public void setPhone(WebDriver driver, String phoneValue) {
        waitUntilNextElement(driver, By.name("phone"), 15);
        driver.findElement(By.name("phone"))
                .sendKeys(phoneValue);
    }

    public void setEmail(WebDriver driver, String emailValue) {
        waitUntilNextElement(driver, By.name("userName"),15);
        driver.findElement(By.name("userName"))
                .sendKeys(emailValue);
    }

    public void setCountry(WebDriver driver, String countryValue) {
        waitUntilNextElement(driver, By.name("country"),15);
        Select country =
                new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText(countryValue);

    }
    public void setUserName(WebDriver driver, String userNameValue) {
        waitUntilNextElement(driver, By.id("email"),15);
        driver.findElement(By.id("email"))
                .sendKeys(userNameValue);

    }
    public void setPassword(WebDriver driver, String passwordValue) {
        waitUntilNextElement(driver, By.name("password"),15);
        driver.findElement(By.name("password"))
                .sendKeys(passwordValue);

    }
    public void setConfirmPassword(WebDriver driver,
                                   String confirmPasswordValue) {
        waitUntilNextElement(driver, By.name("confirmPassword"),15);
        driver.findElement(By.name("confirmPassword"))
                .sendKeys(confirmPasswordValue);

    }
    public void setSubmit(WebDriver driver) {
        // close popup before clicking submit
        handleUnexpectedPopup(driver);
        waitUntilNextElement(driver, By.name("submit"),15);
        WebElement submit =
                driver.findElement(By.name("submit"));
        // JavaScript click avoids interception problem
        ((JavascriptExecutor)driver)
                .executeScript(
                        "arguments[0].click();",
                        submit
                );

    }
    private void handleUnexpectedPopup(WebDriver driver) {
        try {
            WebDriverWait wait =
                    new WebDriverWait(driver,
                            Duration.ofSeconds(3));
            WebElement closeButton =
                    wait.until(
                            ExpectedConditions.presenceOfElementLocated(
                                    By.className("cb-close")
                            )
                    );
            ((JavascriptExecutor)driver)
                    .executeScript(
                            "arguments[0].click();",
                            closeButton
                    );
            System.out.println("Popup closed");
        }
        catch(TimeoutException e){
            System.out.println("No popup");
        }
        catch(Exception e){
            System.out.println("Popup error : "
                    + e.getMessage());

        }

    }
    private void waitUntilNextElement(WebDriver driver,
                                      By locator,
                                      int seconds){
        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(seconds));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

    }


}