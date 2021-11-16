package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//it is used to launch the browsers
		driver.get("https://www.naukri.com");
		Thread.sleep(10000);
		driver.quit();//it is used to close the parent browser and child browsers also
	}

}
