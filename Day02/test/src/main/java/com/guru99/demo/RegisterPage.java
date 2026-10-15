package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    private String firstNameElement = prop.getProperty("RegisterPage", "first.name.element");
    private String lastNameElement = prop.getProperty("RegisterPage", "last.name.element");
    private String phoneElement = prop.getProperty("RegisterPage", "phone.element");
    private String emailElement = prop.getProperty("RegisterPage", "email.element");
    private String countryElement = prop.getProperty("RegisterPage", "country.element");
    private String userNameElement = prop.getProperty("RegisterPage", "username.element");
    private String passwordElement = prop.getProperty("RegisterPage", "password.element");
    private String confirmPasswordElement = prop.getProperty("RegisterPage", "confirm.password.element");
    private String submitElement = prop.getProperty("RegisterPage", "submit.element");

    public RegisterPage setFirstName(String firstNameValue) {
        driver.findElement(By.name(firstNameElement)).sendKeys(firstNameValue);
        return this;
    }

    public RegisterPage setLastName(String lastNameValue) {
        driver.findElement(By.name(lastNameElement)).sendKeys(lastNameValue);
        return this;
    }

    public RegisterPage setPhone(String phoneValue) {
        driver.findElement(By.name(phoneElement)).sendKeys(phoneValue);
        return this;
    }

    public RegisterPage setEmail(String emailValue) {
        driver.findElement(By.name(emailElement)).sendKeys(emailValue);
        return this;
    }

    public RegisterPage setCountry(String countryValue) {
        Select country = new Select(driver.findElement(By.name(countryElement)));
        country.selectByVisibleText(countryValue);
        return this;
    }

    public RegisterPage setUserName(String userNameValue) {
        driver.findElement(By.id(userNameElement)).sendKeys(userNameValue);
        return this;
    }

    public RegisterPage setPassword(String passwordValue) {
        driver.findElement(By.name(passwordElement)).sendKeys(passwordValue);
        return this;
    }

    public RegisterPage setConfirmPassword(String confirmPasswordValue) {
        driver.findElement(By.name(confirmPasswordElement)).sendKeys(confirmPasswordValue);
        return this;
    }

    public RegisterSuccessPage clickSubmit() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.name(submitElement)));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                submitButton);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                submitButton);

        return new RegisterSuccessPage();
    }
}