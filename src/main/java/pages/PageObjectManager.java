package pages;

import io.appium.java_client.AppiumDriver;
import pages.loginPage.LoginPage;
import pages.contactsPage.ContactsPage;
import pages.textMessagePage.TextMessagePage;

public class PageObjectManager {

    public static AppiumDriver driver;
    public LoginPage loginPage;
    public TextMessagePage textMessagePage;
    public ContactsPage contactsPage;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public TextMessagePage getTextMessagePage() {
        textMessagePage = new TextMessagePage(driver);
        return textMessagePage;
    }

    public ContactsPage getContactsPage() {
        contactsPage = new ContactsPage(driver);
        return contactsPage;
    }

}
