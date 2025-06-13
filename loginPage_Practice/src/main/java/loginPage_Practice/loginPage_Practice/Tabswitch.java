package loginPage_Practice.loginPage_Practice;


import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabswitch 
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
//            List<WebElement> headers=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
            String parentWindow=driver.getWindowHandle();
            
            
            driver.findElement(By.xpath("//a[@id='opentab']")).click();
            Set<String> childWindows=driver.getWindowHandles();
            
            for(String w:childWindows) {
            	if(!(parentWindow==w))
            		 driver.switchTo().window(w);
            	//System.out.println(driver.getTitle());
            }
           
           Assert.assertTrue(driver.getTitle().contains("QAClick Academy"));
           driver.quit();
    }
	
	}

