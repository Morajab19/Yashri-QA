import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update_Account_Negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String expMsg = "Passwords must be at least 7 characters and contain both alphabetic and numeric characters.";
		 String expPhoneNum = "01559950234";
		 driver.navigate().to("https://yashry.com/");
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
		 
		 driver.findElement(By.id("FormField_2_input")).sendKeys("123456");
		 Thread.sleep(2000);
		 
		
		 driver.findElement(By.id("FormField_3_input")).sendKeys("123456");
		
		 driver.findElement(By.id("FormField_24_input")).sendKeys("AAA12345");
		
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/form/div/button")).click();
		 Thread.sleep(2000);
		 String msg = driver.findElement(By.xpath("//*[@id=\"FormField_2\"]/span")).getText();
		
		 if (msg.equals(expMsg)) {
			 System.out.println("Passed test case");

		 }
		 else {
			 System.out.println("Failed test case");

		 }
		 
		
		 driver.close();
		 driver.quit();
		

	}

}
