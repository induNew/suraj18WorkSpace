package qsp;


import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxAfterDelay {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//avoiding IllegalStateException
		FirefoxDriver driver=new FirefoxDriver();//opening the browser
		Thread.sleep(10000);
		driver.close();//closing the browser
	}
	

}
