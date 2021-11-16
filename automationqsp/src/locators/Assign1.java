package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("surajsawant@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("suraj@2020");
		Thread.sleep(4000);
		driver.findElement(By.id("u_0_d_kH")).click();
	}

}
