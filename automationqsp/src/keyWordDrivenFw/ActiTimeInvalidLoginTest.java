package keyWordDrivenFw;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidLoginTest extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


		BaseTest bt = new BaseTest();
		//open the browser
		bt.openBrowser();

		Flib flib = new Flib();
		
		//get the row count to itterate the for loop for all the rows
		int rc = flib.getTheRowCount("./data/Testdata.xlsx", "invalidcreds");

		for(int i=1;i<=rc;i++) 
		{
			String username = flib.readExcelData("./data/Testdata.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/Testdata.xlsx", "invalidcreds", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);

		}
	}

}
