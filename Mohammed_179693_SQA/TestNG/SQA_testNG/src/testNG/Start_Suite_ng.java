package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Start_Suite_ng {
	
		 public static WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
	  driver =new ChromeDriver();
	 
	//Puts an implicit wait, will wait for 10 seconds before throwing exception
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.navigate().to("https://yashry.com/");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
  }

}
