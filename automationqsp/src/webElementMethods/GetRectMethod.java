package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		Rectangle rect = logo.getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		System.out.println("the height of logo "+height);
		System.out.println("the width  of logo "+width);
		
		
		
		
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println("The x axis distance is "+xaxis);
		System.out.println("The y axis distance is "+yaxis);
	
		
	}

}
