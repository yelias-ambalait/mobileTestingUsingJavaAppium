package stepDefinitions;
import com.google.common.base.Verify;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.loginPage.LoginPage;
import utils.ContextSetup;

import java.time.Duration;


public class LoginSteps {

    public AppiumDriver driver;
    LoginPage loginPage;
    ContextSetup setup;


    public LoginSteps(ContextSetup setup) {
        this.setup = setup;
        this.loginPage = setup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
    }


    @Given("Home page is displayed")
    public void Home() {
        Assert.assertTrue(loginPage.getHomeTitle().isDisplayed());
    }

    @Then("Check that the login form is displayed")
    public void LoginForm() {
        Assert.assertTrue(loginPage.getHomeTitle().isDisplayed());
        Assert.assertTrue(loginPage.getMobileInput().isDisplayed());
        Assert.assertTrue(loginPage.getPasswordInput().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
    }

    @When("Click on the login button")
    public void LoginButton() throws InterruptedException {
        loginPage.getLoginButton().click();
        Thread.sleep(2000);
    }

    @Then("Check that the {string} message is displayed")
    public void Message(String message) {
        Assert.assertTrue(loginPage.getMessage().isDisplayed());
//        Assert.assertEquals(loginPage.getMessage().getText(), message);

    }
}