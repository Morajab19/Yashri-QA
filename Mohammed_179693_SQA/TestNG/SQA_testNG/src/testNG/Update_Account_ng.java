package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Update_Account_ng {
	public static WebDriver driver ;
  @Test
  public void f() throws InterruptedException {
	  String expMsg = "Your account details have been updated.";
		 String expPhoneNum = "01559950234";
	  driver.findElement(By.xpath("//*[@id=\"navUser-more-toggle\"]")).click();
		 driver.findElement(By.id("login_email")).sendKeys("yodakib255@whwow.com");
		 driver.findElement(By.id("login_pass")).sendKeys("AAA12345");
		 driver.findElement(By.xpath("//*[@id=\"navUser-more-panel\"]/div/ul/li[1]/form/div[4]/input")).click();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/nav/ul/li[5]/a")).click();
		 driver.findElement(By.id("account_firstname")).clear();
		 driver.findElement(By.id("account_firstname")).sendKeys("Mohammed");
		 driver.findElement(By.id("account_lastname")).clear();
		 driver.findElement(By.id("account_lastname")).sendKeys("Rajab");
		 driver.findElement(By.id("account_phone")).clear();
		 driver.findElement(By.id("account_phone")).sendKeys("01559950234");
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/form/div/button")).click();
		 Thread.sleep(2000);
		 String msg = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/p/span")).getText();
		 String phoneNum = driver.findElement(By.id("account_phone")).getAttribute("value");
		 if (msg.equals(expMsg) && phoneNum.equals(expPhoneNum)) {
			 System.out.println("Passed test case");

		 }
		 else {
			 System.out.println("Failed test case");

		 }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); 
	  driver =new ChromeDriver();
	 
	//Puts an implicit wait, will wait for 10 seconds before throwing exception
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.navigate().to("https://yashry.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
		 driver.quit();
  }

}
