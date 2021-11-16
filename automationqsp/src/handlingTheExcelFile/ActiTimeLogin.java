package handlingTheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/Testdata.xlsx", "validcreds", 1, 0);
		String password = flib.readExcelData("./data/Testdata.xlsx", "validcreds", 1, 1);
		
		usn.sendKeys(username);
		Thread.sleep(1000);
		pass.sendKeys(password);
		
		loginBtn.click();
		Thread.sleep(3000);
		
		String homePageTitle = driver.getTitle();
		if(homePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			flib.writeExcelData("./data/Testdata.xlsx", "validcreds", 1, 2, "PASS");
			
		}
		
		else
		{
			flib.writeExcelData("./data/Testdata.xlsx", "validcreds", 1, 2, "FAIL");
		}
		
		
		
	}

}
