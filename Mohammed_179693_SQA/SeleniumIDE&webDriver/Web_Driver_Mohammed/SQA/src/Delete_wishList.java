import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_wishList {

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
		 String oldWishlistNum = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/nav/ul/li[3]")).getText();
		 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/table/tbody/tr/td[4]/form/fieldset/input")).click();
		
		 //String msg = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 String newWishlistNum = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/nav/ul/li[3]")).getText();
		 if (oldWishlistNum.equals(newWishlistNum)) {
			 System.out.println("Failed test case");

		 }
		 else {
			 System.out.println("Passed test case");

		 }
	
		 driver.close();
		 driver.quit();
	}

}
