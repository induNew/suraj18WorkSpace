package handlingTheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");

		Flib flib = new Flib();
		int rc = flib.rowcount("./data/Testdata.xlsx", "invalidcreds");
		
		for(int i=1;i<rc;i++) {
			String username = flib.readExcelData("./data/Testdata.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/Testdata.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
			boolean statusOfErrorMsg = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']")).isDisplayed();
			if(statusOfErrorMsg=true)
			{
				flib.writeExcelData("./data/Testdata.xlsx", "invalidcreds", i, 2, "PASS");
			}
			
			else
			{
				flib.writeExcelData("./data/Testdata.xlsx", "invalidcreds", i, 2, "FAIL");
			}
			
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
			
		}



	}

}
