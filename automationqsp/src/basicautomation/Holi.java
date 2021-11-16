package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Holi {
	
	public static void main(String[] args) {
		//set the path of driver executable
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize
		driver.get("https://www.google.com");//launch the web app
		
		driver.switchTo().activeElement().sendKeys("holi",Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Feed")).click();
		
		
		
	}

}
