package herokuapp_project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static String browser="Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver=new ChromeDriver();
        }
         else if (browser.equalsIgnoreCase("Edge")) {
             driver=new EdgeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver=new FirefoxDriver();
        }
         else {
            System.out.println("Wronge browser name");
        }
//Open the base url in chrome browser
        driver.get(baseUrl);
        //Maximise the window
        driver.manage().window().maximize();
        //Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Printing the title of page
        System.out.println("Title of the page: " + driver.getTitle());
        //Printing the current Url
        System.out.println("current url is: " + driver.getCurrentUrl());
        //Printing Source code
        System.out.println("Source code of page: " + driver.getPageSource());
        //Adding the value in Username field
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Shaiphali");
        //Adding value in password
        driver.findElement(By.id("password")).sendKeys("12345#");
        //closing the browser
        driver.close();
    }

}
