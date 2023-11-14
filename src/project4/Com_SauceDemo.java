package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_SauceDemo {
    public static void main(String[] args) throws InterruptedException {
        //Step:1 Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Step:2 open the url into browser
        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);
        //Step:3 Print the title of the page
        System.out.println("Title of the page:" + driver.getTitle());
        //Step:4 Print the current url.
        System.out.println("CurrentUrl:" + driver.getCurrentUrl());
        //Step:5 Print the page Source
        System.out.println("Page Source :" + driver.getPageSource());
        //Step:6 Find username field  element and type the email
        WebElement usernameFieldLink = driver.findElement(By.name("user-name"));
        usernameFieldLink.sendKeys("Amruta");
        //Step:7 Find password filed element and click on it
        WebElement passwordFieldLink = driver.findElement(By.name("password"));
        passwordFieldLink.sendKeys("123456");
        //Step:8 Click on Login Button.
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(5000);
        //Step:9 Print the current url.
        System.out.println("Current url:" + driver.getCurrentUrl());
        //Step:10 Navigate to baseUrl
        driver.navigate().back();
        //Step:11 Refresh the page.
        driver.navigate().refresh();
        //Step:12 Close the browser.
        driver.quit();








    }
}
