package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.contactsPage.ContactsPage;
import utils.ContextSetup;

public class ContactsSteps {

    ContextSetup setup;
    ContactsPage contactsPage;
    public ContactsSteps(ContextSetup setup) {
        this.setup = setup;
        this.contactsPage = setup.pageObjectManager.getContactsPage();
    }

    @Given("Contacts is displayed")
    public void contacts_is_displayed() throws InterruptedException {
        contactsPage.getContacts().isDisplayed();
    }
    @When("Click on the plus button")
    public void plus_button() throws InterruptedException {
        contactsPage.getPlusIcon().click();
        Thread.sleep(3000);
    }
    @When("Fill the required fields")
    public void fill_the_required_fields() {
        contactsPage.getFirstName().sendKeys("John");
        contactsPage.getLastName().sendKeys("Doe");
    }
}
