package Framework.Framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.

/**
 * Unit test for simple App.
 */
public class AppTest     
{
    /**
     * Create the test case
     * @throws MalformedURLException 
     */
    @Test
    public void testApp() throws MalformedURLException
    {
      Assert.assertTrue( true );
      System.out.println("HI");
      
      DesiredCapabilities cap1 = DesiredCapabilities.chrome();
      cap1.setBrowserName("chrome");
      //cap1.setVersion("2.49.1");
      cap1.setPlatform(Platform.VISTA);
      
      WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.9:5566/wd/hub"), cap1);
      driver.get("http://www.google.com");
   /*   WebDriver driver = new FirefoxDriver();
      //driver.navigate().to("www.example.com");
      System.out.println(driver.getClass().getName());
      driver.get("http://www.google.com");
      
      WebDriver driver1 = new InternetExplorerDriver();
      driver1.get("http://www.gmail.com");
      System.out.println(driver1.getClass().getName());
      
      WebDriver driver2 = new ChromeDriver();
      driver2.get("http://www.yahoo.com");
      System.out.println(driver2.getClass().getName());
      
      WebDriver driver3 = new SafariDriver();
      driver3.get("http://www.yelp.com");
      System.out.println(driver3.getClass().getName());*/
    }
}
