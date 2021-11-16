package webElementMethods;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/Checkboxes.html");
		WebElement automationCheckBox = driver.findElement(By.id("ch4"));
		String attrvalue = automationCheckBox.getAttribute("name");
		System.out.println(attrvalue);//n4
		
	}

}
