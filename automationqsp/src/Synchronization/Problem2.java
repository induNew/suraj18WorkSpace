package Synchronization;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Problem2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
        //verify login page title
		String actualLoginPageTitle = driver.getTitle();

		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page title TEST CASE IS PASS >>>");
		}
		else
		{
			System.out.println("Login page title TEST CASE IS fail >>>");
		}
		
		//login to the app
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		//verify the home page title
		String actualHomePageTitle = driver.getTitle();

		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page title TEST CASE IS PASS >>>");
		}
		else
		{
			System.out.println("Home page title TEST CASE IS fail >>>");
		}

	}

}
