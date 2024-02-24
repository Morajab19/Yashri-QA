package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Edit_wishlist_ng extends Create_whislist_ng {
	//public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  String exp = "summer collection 2";
	  driver.findElement(By.xpath("//*[@id=\"navUser-more-toggle\"]")).click();
//		 driver.findElement(By.id("login_email")).sendKeys("yodakib255@whwow.com");
//		 driver.findElement(By.id("login_pass")).sendKeys("AAA12345");
		 driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/nav/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[4]/form/fieldset/a")).click();
		 driver.findElement(By.id("wishlistname")).clear();
		 driver.findElement(By.id("wishlistname")).sendKeys("summer collection 2");
		 driver.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/div/div/form/div[2]/label")).click();
		 driver.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/div/div/form/div[3]/input[1]")).click();
		 Dimension sharable = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[4]/form/fieldset/a[1]")).getSize();
		 String wishListName = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[1]/a")).getText();
		 if (wishListName.equals(exp) && sharable.height>0 && sharable.width>0) {
			 System.out.println("Edit Wishlist Passed test case");

		 }
		 else {
			 System.out.println("Failed test case");

		 }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
//	  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
//		 driver=new ChromeDriver();
//		 
//
//		//Puts an implicit wait, will wait for 10 seconds before throwing exception
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
		 driver.navigate().to("https://yashry.com/");
  }

//  @AfterMethod
//  public void afterMethod() {
//	  driver.close();
//		 driver.quit();
//  }

}
