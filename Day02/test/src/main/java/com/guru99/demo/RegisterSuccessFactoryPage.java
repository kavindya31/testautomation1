package com.guru99.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegisterSuccessFactoryPage {

    @FindBy(xpath = "//*[contains(text(),'Dear Imperial College')]")
    WebElement salutationMessage;

    public RegisterSuccessFactoryPage() {
        PageFactory.initElements(TestApp.getInstance().getDriver(), this);
    }

    public String getSalutationMessage() {
        return salutationMessage.getText();
    }
}