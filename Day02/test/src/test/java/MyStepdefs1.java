import com.guru99.demo.HomeFactoryPage;
import com.guru99.demo.RegisterFactoryPage;
import com.guru99.demo.RegisterSuccessFactoryPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class MyStepdefs1 {
    HomeFactoryPage homePage;
    RegisterFactoryPage registerPage;
    RegisterSuccessFactoryPage regSuccessPage;
    @Given("User is on Home Page --> Register Page")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(),HomeFactoryPage.class);
        registerPage=homePage.clickOnRegisterMenu();
    }

    @Given("User enter firstName as {string}")
    public void setFirstName(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @Given("User enter lastName as {string}")
    public void setLastName(String lastName) {
        registerPage.setFirstName(lastName);
    }

    @And("User enter lastName as {string}")
    public void setPhone(String phoneNo) {
        registerPage.setPhone(phoneNo);
    }

    @And("User enter phone as {string}")
    public void setEmail(String email) {
        registerPage.setEmail(email);
    }

    @And("User enter email as {string}")
    public void selectCountry(String country) {
        registerPage.setCountry(country);
    }

    @And("User enter country as {string}")
    public void setUserName(String userName) {
        registerPage.setUserName(userName);
    }

    @And("User enter password as {string}")
    public void setPassword(String password) {
        registerPage.setPassword(password);
    }

    @And("User enter confirm password as {string}")
    public void setConfirmPassword(String confirmPassword) {
        registerPage.setConfirmPassword(confirmPassword);
    }

    @When("User clicks on submit button")
    public void clickSubmit() {
        regSuccessPage=registerPage.submit();
    }

    @Then("salutation message will display as {string}")
    public void verifyMessageText(String expectedMessage) {

    }
}
