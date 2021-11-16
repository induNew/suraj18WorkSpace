package testng;

import org.testng.annotations.Test;

public class Demo1 {


	@Test
	public void login() 
	{
		System.out.println("login to the app");
		int a=10;
		int result = a/0;
		System.out.println(result);
		
	}
	
	
	@Test
	public void logout()
	{
		System.out.println("Logout from app");
	}
}
