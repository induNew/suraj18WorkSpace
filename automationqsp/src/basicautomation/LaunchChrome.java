package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		//set the path of driver executable
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize
		driver.get("http://laptop-smc8hiai/login.do");//launch the web app
		
		driver.findElement(By.name("username")).sendKeys("admin");//sends admin to username textbox
		driver.findElement(By.name("pwd")).sendKeys("manager");//sends manager to password textbox
		driver.findElement(By.id("loginButton")).click();//click on  the login button
		
	}

}
