package pages.loginPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage {

    public AppiumDriver driver;
    public WebElement text;

    By homeTitle = By.className("android.view.View");
    By mobileInput = By.className("android.widget.EditText");
    By passwordInput = By.className("android.widget.EditText");
    By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");
    By message = By.xpath("(//android.view.View[@content-desc='This field cannot be left empty!'])[2]");

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeTitle() {
        return driver.findElement(homeTitle);
    }

    public WebElement getMobileInput() {
        return driver.findElement(mobileInput);
    }
    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getMessage() {
        return driver.findElement(message);
    }
}
