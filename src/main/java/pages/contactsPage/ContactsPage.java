package pages.contactsPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage {

    AppiumDriver driver;

    By contactsDash = By.className("android.widget.TextView");
    By plusIcon = By.id("com.android.contacts:id/floating_action_button_container");
    By firstName = By.xpath("//android.widget.EditText[@text='First name']");
    By lastName = By.xpath("//android.widget.EditText[@text='Last name']");
    public ContactsPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement getContacts(){
        return driver.findElement(contactsDash);
    }
    public WebElement getPlusIcon(){
        return driver.findElement(plusIcon);
    }
    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }
    public WebElement getLastName(){
        return driver.findElement(lastName);
    }
}
