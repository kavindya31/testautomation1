package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterSuccessPage {

    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop =new PropertyFileReader();
    String salutationMessageText=prop.getProperty("RegisterSuccessPage","message.element");

    public String getSalutationMessage() {

        TestApp.getInstance().waitUntilNextElementAppears(
                By.xpath(salutationMessageText),
                10
        );

        WebElement salutationMessageElement =
                driver.findElement(By.xpath(salutationMessageText));

        return salutationMessageElement.getText();
    }
}