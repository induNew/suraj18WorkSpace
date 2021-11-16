package handlingWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYZ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.naukri.com");
	
		String parentHandle = driver.getWindowHandle();//parent Handle
		String parentTitle = driver.getTitle();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Cognizant"))
			{
				driver.manage().window().maximize();
			}
			
			else
			{
				
			}
		}
		
	
		
		
		
		
		
		
		
		

	}
}
