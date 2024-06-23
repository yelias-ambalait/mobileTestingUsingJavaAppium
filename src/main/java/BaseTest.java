import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 4");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceVersion", "14");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.google.android.apps.messaging");
        cap.setCapability("appActivity", "com.google.android.apps.messaging.home.HomeActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);
        System.out.println("Application is started...");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By startChat = By.id("com.google.android.apps.messaging:id/start_new_conversation_button");
        WebElement chat = driver.findElement(startChat);
        chat.click();


        By sender = By.id("com.google.android.apps.messaging:id/contact_name");
        WebElement senderNumber = driver.findElement(sender);
        senderNumber.click();

        By composeMessage = By.id("com.google.android.apps.messaging:id/compose_message_text");
        WebElement message = driver.findElement(composeMessage);
        message.sendKeys("Hello");

        By send = By.id("com.google.android.apps.messaging:id/send_message_button_icon");
        WebElement sendButton = driver.findElement(send);
        sendButton.click();


    }
}
