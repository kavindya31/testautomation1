package com.guru99.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestApp;

import java.awt.*;
import java.time.Duration;

public class RegisterFactoryPage {
    @FindBy(name="firstName") private WebElement firstNameElement;
    @FindBy(name="lastName") private WebElement lastNameElement;
    @FindBy(name="phone") private WebElement phoneElement;
    @FindBy(name="userName") private WebElement emailElement;
    @FindBy(name="country") private WebElement countryElement;
    @FindBy(name="email") private WebElement userNameElement;
    @FindBy(name="password") private WebElement passwordElement;
    @FindBy(name="confirmPassword") private WebElement confirmPasswordElement;
    @FindBy(name="submit") private WebElement submitElement;

    public RegisterFactoryPage setFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("firstName"),10);
        firstNameElement.sendKeys(firstName);
        return this;
    }

   public RegisterFactoryPage setPhone(String phone){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("phone"),10);

       firstNameElement.sendKeys(phone);

        return this;
    }

    public RegisterFactoryPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("lastName"),10);
        lastNameElement.sendKeys(lastName);
        return this;
    }

    public RegisterFactoryPage setUserName(String userName){
      TestApp.getInstance().waitUntilNextElementAppears(By.name("userName"),10);
        userNameElement.sendKeys(userName);
        return this;
    }

    public RegisterFactoryPage setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("email"),10);
        emailElement.sendKeys(email);
        return this;
    }

    public RegisterFactoryPage setCountry(String countryName){
        Select countryDropDownMenu = new Select(countryElement);
        countryDropDownMenu.selectByVisibleText(countryName);
        return this;
    }

    public RegisterFactoryPage setPassword(String password){
        passwordElement.sendKeys(password);
        return this;
    }

    public RegisterFactoryPage setConfirmPassword(String password){
        passwordElement.sendKeys(password);
        return this;
    }

    public RegisterSuccessFactoryPage submit(){
        handleUnexpectedPopup();

        Robot submitButtonElement = null;
        submitButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),RegisterSuccessFactoryPage.class);
    }

    private void handleUnexpectedPopup() {
        try {
            WebDriver driver = null;
            WebDriverWait wait =
                    new WebDriverWait(driver,
                            Duration.ofSeconds(3));
            WebElement closeButton =
                    wait.until(
                            ExpectedConditions.presenceOfElementLocated(
                                    By.className("cb-close")
                            )
                    );
            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            closeButton
                    );
            System.out.println("Popup closed");
        } catch (TimeoutException e) {
            System.out.println("No popup");
        } catch (Exception e) {
            System.out.println("Popup error : "
                    + e.getMessage());

        }
    }}








