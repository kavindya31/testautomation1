package com.guru99.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PropertyFileReader;



public class RegisterUserTest2 {


    WebDriver driver;


    PropertyFileReader prop =
            new PropertyFileReader();


    String urlValue =
            prop.getProperty("config","url");



    Home homepage;

    Register registerPage;

    RegisterSuccess regSuccessPage;





    @BeforeClass
    public void setup(){


        driver = new ChromeDriver();


        driver.get(urlValue);


        driver.manage().window().maximize();



        homepage = new Home();


        homepage.clickOnRegisterMenu(driver);



        registerPage = new Register();


        regSuccessPage = new RegisterSuccess();



    }






    @Test
    public void testRegisterNewUser(){



        String firstName = "Imperial";

        String lastName = "College";



        registerPage.setFirstName(driver,firstName);


        registerPage.setLastName(driver,lastName);


        registerPage.setPhone(driver,"0987653986");


        registerPage.setEmail(driver,
                "kavi123@test.com");



        registerPage.setCountry(driver,
                "SRI LANKA");



        // IMPORTANT: username field
        registerPage.setUserName(driver,
                "kavi123");



        registerPage.setPassword(driver,
                "Test@1234");



        registerPage.setConfirmPassword(driver,
                "Test@1234");



        registerPage.setSubmit(driver);





        String actualMessage =
                regSuccessPage.getSalutationMessage(driver)
                        .replace(",", "")
                        .trim();


        String expectedMessage =
                "Dear " + firstName + " " + lastName;


        Assert.assertEquals(
                actualMessage,
                expectedMessage,
                "Failed to register user"
        );



    }





    @AfterClass

    public void tearDown(){


        if(driver != null){

            driver.quit();

        }

    }


}