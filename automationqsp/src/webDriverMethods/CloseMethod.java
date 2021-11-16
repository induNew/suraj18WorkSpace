package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//it is used to launch the browsers
		driver.get("https://www.naukri.com");
		Thread.sleep(10000);
		driver.close();//it is used to close the  browser
	}

}
