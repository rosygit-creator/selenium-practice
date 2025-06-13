package loginPage_Practice.loginPage_Practice;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table1 
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
         
            // get table headers
            List<WebElement> headers=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
            
            
            Assert.assertEquals(3, headers.size());
           Assert.assertEquals(headers.get(0).getText(), "Instructor");
           Assert.assertEquals(headers.get(1).getText(), "Course");
           Assert.assertEquals(headers.get(2).getText(), "Price");
          
  // verify column value
           
           
          WebElement column= driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[6]/td[2]"));
//          assertTrue(actualString.contains("specific text"));
          Assert.assertTrue(column.getText().contains("JMETER"));
  
            driver.quit();
    }
	
	}

