package Gaian_Pi.Gaian_Pi;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
LoginPage lip;
	
	@Test
	public void logInTest()
	{
		lip=new LoginPage();
		
		lip.login("mobius@gaiansolutions.com","Gaian@123");
		//lip.logIn(applicationUrlAddress, applicationUrlAddress);
	}
}
