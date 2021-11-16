package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hub {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://app.hubspot.com/login?__cf_chl_jschl_tk__=pmd_iYWEAv5Oi8cCQ3gnuZ.UJjtRlFOXXMj8tSpesLzIWEw-1632799401-0-gqNtZGzNAhCjcnBszQil");
		Thread.sleep(10000);
		driver.findElement(By.id("username")).sendKeys("surajsawant@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("suraj@2020");
		Thread.sleep(4000);
		driver.findElement(By.id("loginBtn")).click();
	}
	
	
	
	

}
