import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_wishList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String exp = "summer collection";
		 driver.navigate().to("https://yashry.com/");
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
			 System.out.println("Passed test case");

		 }
		 else {
			 System.out.println("Failed test case");

		 }
		
		 
		
		 
		 
		 driver.close();
		 driver.quit();
	}

}
