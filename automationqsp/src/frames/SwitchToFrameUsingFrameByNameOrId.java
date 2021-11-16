package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrameUsingFrameByNameOrId {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/username.html");
		driver.findElement(By.id("un")).sendKeys("suraj");
		Thread.sleep(5000);
		
		driver.switchTo().frame("frnm");
		driver.findElement(By.id("pwd")).sendKeys("sawant");



	}
}
