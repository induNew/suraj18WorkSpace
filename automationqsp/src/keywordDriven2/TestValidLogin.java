package keywordDriven2;

import java.io.IOException;

import org.openqa.selenium.By;


public class TestValidLogin extends BaseTest{
	
	
	public static void main(String[] args) throws IOException {
		
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		bt.tearDown();
		
	
		
		
	}

}
