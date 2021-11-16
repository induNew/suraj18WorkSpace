package keyWordDrivenFw;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLoginTest  extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		//open the browser
		bt.openBrowser();
		
		//read the validcredentials from property file
		String username = flib.readPropertyData("./data/config.properties", "username");
		String password = flib.readPropertyData("./data/config.properties", "password");
		
		//send credentials
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		//close the browser
		bt.closeBrowser();
		
	}

	
}
