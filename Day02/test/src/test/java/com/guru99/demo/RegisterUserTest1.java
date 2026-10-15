package com.guru99.demo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyFileReader;

import java.time.Duration;

public class RegisterUserTest1 {

    WebDriver driver;
    PropertyFileReader prop= new PropertyFileReader();
    String urlValue = prop.getProperty("config","url");

    @Test
    public void testRegisterUser() {

        driver = new ChromeDriver();
        //driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.get(urlValue);
        driver.manage().window().maximize();

        // Wait for REGISTER link and click
        waitUntilNextElement(By.xpath("//a[text()='REGISTER']"), 5);
        WebElement register = driver.findElement(By.xpath("//a[text()='REGISTER']"));
        register.click();

        // Wait for Registration page
        waitUntilNextElement(By.name("firstName"), 5);

        // First Name
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("Imprial");

        waitUntilNextElement(By.name("firstName"), 2);
        firstname.clear();

        waitUntilNextElement(By.name("firstName"), 2);
        firstname.sendKeys("new Imprial value");

        // Last Name
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("collage");

        // Phone
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0234561234");

        // Email
        WebElement usernameEmail = driver.findElement(By.id("userName"));
        usernameEmail.sendKeys("kavindya123@gmail.com");

        // Country Dropdown
        Select countrydropdown = new Select(driver.findElement(By.name("country")));

        countrydropdown.selectByVisibleText("SRI LANKA");
        waitUntilNextElement(By.name("country"), 2);

        countrydropdown.selectByValue("SWEDEN");
        waitUntilNextElement(By.name("country"), 2);

        countrydropdown.selectByIndex(2);

        // Username
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("kavi123");

        // Password
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("Kavindya123");

        // Confirm Password
        WebElement conpassword = driver.findElement(By.name("confirmPassword"));
        conpassword.sendKeys("Kavindya123");

        // Submit
        WebElement submit = driver.findElement(By.name("submit"));

        handleUnexpectedPopup();

        submit.click();

        // Wait for confirmation page
        waitUntilNextElement(By.xpath("//*[contains(text(),'Dear')]"), 10);

        WebElement salutationMessageElement =
                driver.findElement(By.xpath("//*[contains(text(),'Dear')]"));

        String actualMessage = salutationMessageElement.getText();

        System.out.println(actualMessage);

        Assert.assertTrue(
                "FAILED TO REGISTER USER",
                actualMessage.toUpperCase().contains("DEAR")
        );

        driver.quit();
    }

    private void waitUntilNextElement(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void handleUnexpectedPopup() {

        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            WebElement closeBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.className("cb-close"))
            );

            closeBtn.click();

            System.out.println("Popup closed successfully");

        } catch (TimeoutException e) {

            System.out.println("No popup appeared");

        } catch (Exception e) {

            System.out.println("Popup handling failed: " + e.getMessage());

        }
    }
}