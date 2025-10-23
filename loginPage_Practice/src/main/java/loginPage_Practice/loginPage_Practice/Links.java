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

public class Links 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String url="https://the-internet.herokuapp.com/";
        
            System.setProperty(
                "webdriver.chrome.driver",
                "/Users/rosyagarwal/gitWork/selenium-practice/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Maximize the browser
            // using maximize() method
            driver.manage().window().maximize();

            // Launching website
            driver.get(url);
           String pageTitle= driver.getTitle();
           System.out.println("main page "+ pageTitle);
           String parentWindow=driver.getWindowHandle();
           
            // get all links
            List<WebElement> links=driver.findElements(By.tagName("a"));
            System.out.println(links.size());
            
            for(WebElement link: links) {
            		String href=link.getAttribute("href");
//            		 System.out.println(href);
            		driver.get(href);
            		String childWindow=driver.getWindowHandle();
            		driver.switchTo().window(childWindow);
            		String childTitle=driver.getTitle();
            		 System.out.println("child title" + childTitle);
            		 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		 driver.switchTo().window(parentWindow);
            		
            }
            
            
            
        //     driver.findElement(By.xpath("//a[@id='opentab']")).click();
        //     Set<String> childWindows=driver.getWindowHandles();
            
        //     for(String w:childWindows) {
        //     	if(!(parentWindow==w))
        //     		 driver.switchTo().window(w);
        //     	//System.out.println(driver.getTitle());
        //     }
           
        //    Assert.assertTrue(driver.getTitle().contains("QAClick Academy"));
           driver.close();
    }
	
	}

