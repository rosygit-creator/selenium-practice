package loginPage_Practice.loginPage_Practice;


import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String url="https://rahulshettyacademy.com/AutomationPractice/";
        
            System.setProperty(
                "webdriver.chrome.driver",
                "/Users/rosyagarwal/gitWork/selenium-practice/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Maximize the browser
            // using maximize() method
            driver.manage().window().maximize();

            // Launching website
            driver.get(url);
         
            // add value to textbox
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("name");
            
            // click alert
            driver.findElement(By.cssSelector("#alertbtn")).click();
            
            // switch to alert window
            String alertText=driver.switchTo().alert().getText();
            
            Assert.assertTrue(alertText.contains("Hello"));
            
            // click ok button
            Alert alert = driver.switchTo().alert();
            alert.accept();
            
           
           
           
           driver.quit();
    }
	
	}

