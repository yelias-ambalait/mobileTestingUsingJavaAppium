package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Base {
    public  AppiumDriver driver;


    public AppiumDriver AppiumDriverManager() throws Exception{

        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String deviceName = properties.getProperty("device.name");
        String udid = properties.getProperty("device.udid");
        String deviceVersion = properties.getProperty("device.version");
        String devicePlatform = properties.getProperty("device.platform");
        String dUrl = properties.getProperty("device.url");
        String appPackage = properties.getProperty("device.appPackage");
        String appActivity = properties.getProperty("device.appActivity");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("udid", udid);
        cap.setCapability("deviceVersion", deviceVersion);
        cap.setCapability("platformName", devicePlatform);

        cap.setCapability("appPackage", appPackage);
        cap.setCapability("appActivity", appActivity);


        try {
            URL url = new URL(dUrl);
            driver = new AppiumDriver(url, cap);
            Thread.sleep(5000);
            System.out.println("Application is started...");
        } catch (Exception e) {
            System.out.println("Device not found");
            e.printStackTrace();
        }

        return driver;

    }

}
