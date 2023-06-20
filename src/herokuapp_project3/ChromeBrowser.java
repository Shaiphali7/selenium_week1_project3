package herokuapp_project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
//Declare the driver
        WebDriver driver = new ChromeDriver();
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
