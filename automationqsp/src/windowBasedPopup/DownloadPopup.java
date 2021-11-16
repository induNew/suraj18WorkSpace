package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopup {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");                                                                                            
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("4.0.0")).click();
	
		Thread.sleep(5000);
		
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\git\\repository22\\automationqsp\\autoit\\lasttry.exe");
		
	}

}
