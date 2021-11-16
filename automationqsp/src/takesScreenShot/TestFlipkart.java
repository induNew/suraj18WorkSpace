package takesScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestFlipkart extends BaseTest {

	@BeforeMethod
	public void setup()
	{
		initialization();
		
	}
	
	@Test
	public void testFlipkart()
	{
		Assert.fail();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
