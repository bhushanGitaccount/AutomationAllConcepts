package AppiumConcepts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class calculatorApp {
    String path;
    AndroidDriver driver;

    @Test
    public void test1() throws MalformedURLException {

        path = System.getProperty("user.dir");
        System.out.println(path+"//APK//Sample.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy J7 Prime");
        capabilities.setCapability("platformVersion","8.1.0");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app",path+"//APK//Sample.apk");
        //File file = new File(path+"//APK//Sample.apk");
      //  driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub", capabilities));
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);

        //driver.findElementByAccessibilityId("com.dgotlieb.automationsample:id/userName").sendKeys("Bhushan");
       // driver.findElementByAccessibilityId("com.dgotlieb.automationsample:id/userPassword").sendKeys("123");

        driver.findElementById("com.dgotlieb.automationsample:id/userName").sendKeys("Bhushan");
        System.out.println("**********Testing done ******");
    }
}
