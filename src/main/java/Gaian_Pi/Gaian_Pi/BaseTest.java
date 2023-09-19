package Gaian_Pi.Gaian_Pi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest 
{
	public static WebDriver driver;
	
	String applicationUrlAddress="https://pi.gaiansolutions.com/dashboard";
	
	@BeforeTest
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./ExicutableFiles/chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
  //  @AfterTest
	public void applicationClose()
	{
		driver.quit();
	}

}
