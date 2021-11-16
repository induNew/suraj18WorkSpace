package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeAfterDelay {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//avoiding IllegalStateException
		ChromeDriver driver=new ChromeDriver();//opening the browser
		Thread.sleep(10000);
		driver.close();//closing the browser
	}
	

}
