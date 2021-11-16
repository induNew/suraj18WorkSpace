package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//avoid the IllegalStateException
		WebDriver driver = new ChromeDriver();//open the browser
		
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/link.html");//launch the web appp
		Thread.sleep(4000);
		String sourceCodeOfWebpage = driver.getPageSource();//get the source code of webpage
		
		System.out.println(sourceCodeOfWebpage);//print that source code
		driver.close();//close the browser
	}

}
