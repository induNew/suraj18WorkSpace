package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		int rc = flib.getTheRowCount(EXCEL_PATH, "invalidcreds");
		bt.setUp();

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);

		}

		bt.tearDown();
	}

}
