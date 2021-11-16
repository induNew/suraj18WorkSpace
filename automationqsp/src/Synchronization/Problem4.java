package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("surajsurajsuraj");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("sawantsawantsawant");
		driver.findElement(By.xpath("//button[contains(@class,'L3NKy')]")).click();

	}

}
