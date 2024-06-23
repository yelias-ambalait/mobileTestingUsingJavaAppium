package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.textMessagePage.TextMessagePage;
import utils.ContextSetup;
public class TextMessageSteps {

    AppiumDriver driver;
    TextMessagePage textMessagePage;
    ContextSetup setup;
    public TextMessageSteps(ContextSetup setup) {
        this.setup = setup;
        this.textMessagePage = setup.pageObjectManager.getTextMessagePage();
    }
    @Given("Start chat button is displayed")
    public void start_chat() {
        textMessagePage.getStartChatButton().isDisplayed();
    }
    @When("Click on the Start Chat button")
    public void start_chat_button() throws InterruptedException {
        textMessagePage.getStartChatButton().click();
        Thread.sleep(2000);
    }
    @When("Click on the Contact name button")
    public void contact_name_button() throws InterruptedException {
        textMessagePage.getContactName().click();
        Thread.sleep(2000);
    }
    @And("Send the message {string} to the specific user")
    public void composeMessage(String message) {
        textMessagePage.getComposeMessage().sendKeys(message);
    }
    @And("Click on the Send button")
    public void clickOnTheSendButton() {
        textMessagePage.getSendButton().click();
    }
}
