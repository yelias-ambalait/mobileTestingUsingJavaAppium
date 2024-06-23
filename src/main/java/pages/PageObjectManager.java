package pages;

import io.appium.java_client.AppiumDriver;
import pages.AdditionPage.AdditionPage;
import pages.textMessagePage.TextMessagePage;

public class PageObjectManager {

    public static AppiumDriver driver;
    public AdditionPage additionPage;
    public TextMessagePage textMessagePage;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public AdditionPage getAdditionPage() {
        additionPage = new AdditionPage(driver);
        return additionPage;
    }
    public TextMessagePage getTextMessagePage() {
        textMessagePage = new TextMessagePage(driver);
        return textMessagePage;
    }

}
