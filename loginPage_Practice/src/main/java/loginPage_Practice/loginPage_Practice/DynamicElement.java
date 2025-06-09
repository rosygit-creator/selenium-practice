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
public class DynamicElement 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String url="https://the-internet.herokuapp.com/dynamic_loading";
        
            System.setProperty(
                "webdriver.chrome.driver",
                "/Users/rosyagarwal/gitWork/selenium-practice/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Maximize the browser
            // using maximize() method
            driver.manage().window().maximize();

            // Launching website
            driver.get(url);
            
            driver.findElement(By.cssSelector("a[href='/dynamic_loading/2']")).click();
            
            // wait and click on start button
            WebDriverWait wait = new WebDriverWait(driver, 5);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='start'] button")));
            element.click();
          
    
            // wait for hello world text
            WebDriverWait w = new WebDriverWait(driver, 5);
            WebElement helloText = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='finish'] h4")));
            
            // verify the text is as expected
            Assert.assertEquals("Hello World!", helloText.getText());
            driver.quit();
    }

	
	}

