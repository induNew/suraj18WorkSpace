package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class RunTimePolymorphismLaunchBrowser {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser name either chrome or firefox");
		String browserValue = sc.nextLine();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IllegalStateException		
			driver=new ChromeDriver();//open chromeBrowser
			Thread.sleep(6000);//delay of 6 seconds
			driver.manage().window().maximize();//maximize the browser
			driver.close();//close the browser
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			Thread.sleep(6000);
			driver.manage().window().maximize();
			driver.close();

		}
		else
		{
			System.out.println("enter the valid choice");
		}
	}
}
