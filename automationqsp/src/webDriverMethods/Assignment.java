package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	    driver.navigate().to("https://www.flipkart.com");
		
		
	}
}
