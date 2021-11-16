package keywordDriven2;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidLogin  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();


		int rc = flib.getTheRowCount(EXCEL_PATH, "invalidcreds");
		for(int i=1;i<=rc;i++)
		{

			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);



			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
			

			bt.tearDown();


		}

	}
