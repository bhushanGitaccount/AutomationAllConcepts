package AppiumConcepts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RunAutomationOnBrowserStack {


    public static void main(String[] args) throws MalformedURLException, InterruptedException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        String path = System.getProperty("user.dir");

        // Set your access credentials
        // Set your access credentials
        caps.setCapability("browserstack.user", "bhushanmore_l3xb0z");
        caps.setCapability("browserstack.key", "ugrrd5hzpg6prnTo4ZyY");

        // Set URL of the application under test
        caps.setCapability("app", "bs://9343d0563422dab8e6b3975ae7d3aab81a4c8aec");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        driver.findElementById("com.dgotlieb.automationsample:id/userName").sendKeys("Bhushan");


        /* Write your Custom code here */


        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
    }
}
