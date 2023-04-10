package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    //static variable decalred and initialize
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
    public static void main(String[] args) {
        //if condition to open the different browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        }else {
            System.out.println("Wrong Browser Name");
        }
        //open URL
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // print the title of page
        System.out.println(driver.getTitle());
        //print the currentURL
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        // find email field and send the values to the email field
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //find password field and send the values to the password field
        driver.findElement(By.id("Password")).sendKeys("prime123");
        //closing the browser
        driver.close();
    }
}
