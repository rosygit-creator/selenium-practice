package loginPage_Practice.loginPage_Practice;


import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String url="https://practicetestautomation.com/practice-test-login/";
        
            System.setProperty(
                "webdriver.chrome.driver",
                "/Users/rosyagarwal/gitWork/selenium-practice/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Maximize the browser
            // using maximize() method
            driver.manage().window().maximize();

            // Launching website
            driver.get(url);
            
         // Print the page title
            System.out.println("Page title is: " + driver.getTitle());
        
            // login page selectors
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
            
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
            
          
            driver.findElement(By.xpath("//button[@id='submit']")).click(); 
            
         
            // logout 
            driver.findElement(By.xpath("//a[contains(.,'Log out')]")).click(); 
            
            driver.quit();
    }

	
	}

