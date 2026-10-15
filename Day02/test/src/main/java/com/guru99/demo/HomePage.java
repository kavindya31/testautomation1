package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class HomePage {

    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String registerMenuWebElement = prop.getProperty("HomePage","register.menu.element");

    public RegisterPage clickOnRegisterMenu() {

        TestApp.getInstance().waitUntilNextElementAppears(
                By.linkText(registerMenuWebElement), 15);
        WebElement registerMenuElement = driver.findElement(By.linkText(registerMenuWebElement));
        registerMenuElement.click();
        return new RegisterPage();

       // driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    }
}