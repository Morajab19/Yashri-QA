package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Create_whislist_ng extends Start_Suite_ng {
	
	 //System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
	// public static WebDriver driver ;
 
  @Test
  public void f() throws InterruptedException {
	 

	     String exp = "summer collection";
		driver.findElement(By.xpath("//*[@id=\"navUser-more-toggle\"]")).click();
		 driver.findElement(By.id("login_email")).sendKeys("yodakib255@whwow.com");
		 driver.findElement(By.id("login_pass")).sendKeys("AAA12345");
		 driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[1]/form/div[4]/input")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/nav/ul/li[3]/a")).click();
		 //driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[5]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/form/div[2]/a")).click();
	
		 driver.findElement(By.id("wishlistname")).sendKeys("summer collection");
		 driver.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/div/div/form/div[3]/input")).click();
		 //Dimension isPresent = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr")).getSize() ;
		 String wishListName = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[1]/a")).getText();
		 Thread.sleep(2000);
		 if (wishListName.equals(exp)) {
			 System.out.println("Create Wishlist Passed test case");

		 }
		 else {
			 System.out.println("Failed test case");

		 }
  }
  
  @BeforeMethod
  public  void  beforeMethod() {
	  
// System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
//	 driver=new ChromeDriver();
//		 
//
//		//Puts an implicit wait, will wait for 10 seconds before throwing exception
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.navigate().to("https://yashry.com/");
  }

//  @AfterMethod
// public void afterMethod() {
////	 
//	  driver.close();
//	  driver.quit();
//  }
////  
  

}
