package com.guru99.demo;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest5 {

    HomeFactoryPage homePage;
    RegisterFactoryPage registerPage;

    @BeforeMethod
    public void setup(){

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

        homePage = PageFactory.initElements(
                TestApp.getInstance().getDriver(),
                HomeFactoryPage.class
        );

        registerPage=homePage.clickOnRegisterMenu();
    }

    @Test
    public void testRegisterNewUser(){
        RegisterSuccessFactoryPage RegSuccessPage = registerPage
                .setFirstName("Imprical")
                .setLastName("Collage")
                .setPhone("10292983237653")
                .setEmail("info@icbt.test.lk")
                .setCountry("SRI LANKA")
                .setUserName("Admin001")
                .setPassword("DemoAdmin")
                .setConfirmPassword("DemoAdmin")
                .submit();
        Assert.assertEquals(
                RegSuccessPage.getSalutationMessage(),
                "Dear Imprical Collage,",
                "Failed to Register New User:"
        );
    }
}