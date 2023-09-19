package Gaian_Pi.Gaian_Pi;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
	LoginPageTest obj;
	HomePage homeObj;
	@Test(priority=1)
	public  void logInTest()
	{
		obj=new LoginPageTest();
		obj.logInTest();
	
	}
	
	@Test(priority=2)
	public void addFuncti() throws InterruptedException
	{
		
		homeObj=new HomePage();
		homeObj.addFunctionality();
		
		homeObj.fillingDetails();
	}
	
	
}
