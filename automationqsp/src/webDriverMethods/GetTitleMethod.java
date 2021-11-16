package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();//it is used to launch the browsers
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		String titleOfSeleniumWebPage = driver.getTitle();
		System.out.println(titleOfSeleniumWebPage);
		

}
}


 