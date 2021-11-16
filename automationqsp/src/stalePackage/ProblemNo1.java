package stalePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemNo1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://laptop-smc8hiai/login.do");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("pwd"));		
//		WebElement loginButton = driver.findElement(By.id("loginButton"));

		username.sendKeys("admin");
		driver.navigate().refresh();
		
		username.sendKeys("admin1");//StaleElementReferenceException because the username holds the old address ...stale means old
		
	}

}
