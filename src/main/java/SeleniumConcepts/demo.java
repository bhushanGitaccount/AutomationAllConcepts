package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demo {

    public static void main(String[] args){
       // System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\new drivers\\Chrome92\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("")).sendKeys("");


        System.out.println("Complete test");
        driver.quit();



    }
}
