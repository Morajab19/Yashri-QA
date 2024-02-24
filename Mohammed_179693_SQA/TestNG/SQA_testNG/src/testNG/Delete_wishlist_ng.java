package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Delete_wishlist_ng extends Edit_wishlist_ng {
  @Test
  public void f() throws InterruptedException {
	//  String exp = "summer collection";
		// driver.navigate().to("https://yashry.com/");
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//*[@id=\"navUser-more-toggle\"]")).click();
		 Thread.sleep(2000);

//		 driver.findElement(By.id("login_email")).sendKeys("yodakib255@whwow.com");
//		 driver.findElement(By.id("login_pass")).sendKeys("AAA12345");
//		 driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[1]/form/div[4]/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[1]/a")).click();
		 Thread.sleep(2000);

		 String oldWishlistNum = driver.findElement(By.xpath("/html/body/div[6]/div[1]/nav/ul/li[3]/a")).getText();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/nav/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[4]/form/fieldset/input")).click();
		 
		
		 //String msg = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 String newWishlistNum = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/nav/ul/li[3]")).getText();
		 if (oldWishlistNum.equals(newWishlistNum)) {
			 System.out.println("Failed test case");

		 }
		 else {
			 System.out.println("Delete wishlist Passed test case");

		 }
  }
  @BeforeMethod
  public void beforeMethod() {

//	  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
//	 		 driver=new ChromeDriver();
//	 		 
//
//	 		//Puts an implicit wait, will wait for 10 seconds before throwing exception
//	 		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		
	 		 driver.navigate().to("https://yashry.com/");
  }

//  @AfterMethod
//  public void afterMethod() {
//	  driver.close();
//		 driver.quit();
//  }

}
