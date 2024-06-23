package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Base {
    public  AppiumDriver driver;


    public AppiumDriver AppiumDriverManager() throws Exception{

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 4");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceVersion", "14");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.google.android.apps.messaging");
        cap.setCapability("appActivity", "com.google.android.apps.messaging.home.HomeActivity");
//        cap.setCapability("appPackage", "com.xerox.epc.way2go");
//        cap.setCapability("appActivity", "com.xerox.epc.way2go.activity.login.LoginActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);
        Thread.sleep(5000);
        System.out.println("Application is started...");

        return driver;

    }

}
