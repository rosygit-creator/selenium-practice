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

public class Radiobutton 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String url="https://formy-project.herokuapp.com/";
        
            System.setProperty(
                "webdriver.chrome.driver",
                "/Users/rosyagarwal/gitWork/selenium-practice/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Maximize the browser
            // using maximize() method
            driver.manage().window().maximize();

            // Launching website
            driver.get(url);
            
            driver.findElement(By.xpath("//a[@class='btn btn-lg'][contains(@href,'/radiobutton')]")).click();
            
            // wait for all 3 elements to be available, else the page requires an implicit wait
            WebDriverWait wait=new WebDriverWait(driver, 5);
            List<WebElement> countCheckbox=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@type='radio']")));
            Assert.assertEquals(3, countCheckbox.size());
          
            
            // check first radio is selected 
           
            Boolean radioSelected=driver.findElement(By.id("radio-button-1")).isSelected();
            Assert.assertTrue("Radio button should be selected, but it is not!", radioSelected);
            
            // select second radio button
            driver.findElement(By.xpath("//input[@value='option2']")).click();
            
            Boolean secondRadioSelected=driver.findElement(By.xpath("//input[@value='option2']")).isSelected();
            Assert.assertTrue("Second radio button should be selected, but it is not!", secondRadioSelected);
            driver.quit();
    }
	
	}

