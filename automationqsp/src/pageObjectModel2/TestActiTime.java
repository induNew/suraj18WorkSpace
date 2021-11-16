package pageObjectModel2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTime {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		username.sendKeys("suraj");
	}

}
