package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest4 {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setUp(){
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage=new HomePage();
        registerPage = homePage.clickOnRegisterMenu();
    }

    @Test
    public void testRegisterNewUser() {

        registerSuccessPage = registerPage
                .setFirstName("Imprical")
                .setLastName("Collage")
                .setPhone("10292983237653")
                .setEmail("info@icbt.test.lk")
                .setCountry("SRI LANKA")
                .setUserName("Admin001")
                .setPassword("DemoAdmin")
                .setConfirmPassword("DemoAdmin")
                .clickSubmit();

        //PAGE OBJECT MODEL
        Assert.assertEquals(
                registerSuccessPage.getSalutationMessage(),
                "Dear Imprical Collage,",
                "Failed to Register New User:"
        );

    }
}
