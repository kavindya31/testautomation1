package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest3 {

    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setup() {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

        homePage = new HomePage();
        homePage.clickOnRegisterMenu();

        registerPage = new RegisterPage();
        registerSuccessPage = new RegisterSuccessPage();
    }

    @Test
    public void testRegisterNewUser() {

        String firstName = "Impirial";
        String lastName = "College";

        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.setPhone("0987653986");
        registerPage.setEmail("kavi123@test.com");
        registerPage.setCountry("SRI LANKA");
        registerPage.setUserName("kavi123");
        registerPage.setPassword("Test@1234");
        registerPage.setConfirmPassword("Test@1234");
        registerPage.clickSubmit();

        Assert.assertEquals(
                registerSuccessPage.getSalutationMessage(),
                "Dear " + firstName + " " + lastName + ",",
                "Salutation message is incorrect."
        );
    }
}