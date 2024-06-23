package pages.textMessagePage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextMessagePage {

    public AppiumDriver driver;


    By startChat = By.id("com.google.android.apps.messaging:id/start_new_conversation_button");
    By contact = By.id("com.google.android.apps.messaging:id/contact_name");
    By composeMessage = By.id("com.google.android.apps.messaging:id/compose_message_text");
    By sendButton = By.id("com.google.android.apps.messaging:id/send_message_button_icon");
    public TextMessagePage(AppiumDriver driver) {
        this.driver = driver;
    }
    public WebElement getStartChatButton(){
        return driver.findElement(startChat);
    }
    public WebElement getContactName(){
        return driver.findElement(contact);
    }
    public WebElement getComposeMessage(){
        return driver.findElement(composeMessage);
    }
    public WebElement getSendButton(){
        return driver.findElement(sendButton);
    }
}
